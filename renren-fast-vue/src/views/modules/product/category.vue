<template>
    <div>
      <el-tree
        :data="menuList"
        :props="defaultProps"
        @node-click="handleNodeClick"
        :expand-on-click-node="false"
        show-checkbox node-key="catId"
        :default-expanded-keys="this.expandedKeys"
        draggable
      >
         <span class="custom-tree-node" slot-scope="{ node, data }">
        <span>{{ node.label }}</span>
        <span>
          <el-button
            v-if="node.level <= 2"
            type="text"
            size="mini"
            @click="() => append(data)">
            Append
          </el-button>

         <el-button
            v-if="node.level <= 2"
            type="text"
            size="mini"
            @click="() => edit(data)">
            edit
          </el-button>

          <el-button
            v-if="node.childNodes.length === 0"
            type="text"
            size="mini"
            @click="() => remove(node, data)">
            Delete
          </el-button>
        </span>
      </span>
      </el-tree>

      <el-dialog
        :title=title
        :visible.sync=" dialogVisible"
        :close-on-click-modal="false"
        width="30%">
        <el-form :model="category">
          <el-form-item label="三级分类名称" :label-width="formLabelWidth">
            <el-input v-model="category.name" autocomplete="off"></el-input>
          </el-form-item>
          <el-form-item label="图表" :label-width="formLabelWidth">
            <el-input v-model="category.icon" autocomplete="off"></el-input>
          </el-form-item>
          <el-form-item label="计量单位" :label-width="formLabelWidth">
            <el-input v-model="category.productUnit" autocomplete="off"></el-input>
          </el-form-item>
        </el-form>
        <span slot="footer" class="dialog-footer">
          <el-button @click="dialogVisible = false">取 消</el-button>
          <el-button type="primary" @click="submitData">确 定</el-button>
        </span>
      </el-dialog>
    </div>
</template>

<script>
  export default {
    data () {
      return {
        // eslint-disable-next-line standard/object-curly-even-spacing
        formLabelWidth: '200',
        category: {
          name: '',
          parentCid: 0,
          catLevel: 0,
          showStatus: 1,
          sort: 0,
          productUnit: '',
          icon: null,
          catId: null
        },
        title: '添加分类',
        expandedKeys: [],
        menuList: [],
        dialogType: '',
        dialogVisible: false,
        defaultProps: {
          children: 'children',
          label: 'name'
        }
      }
    },
    methods: {
      handleNodeClick (data) {
        console.log(data)
      },
      getMenus () {
        this.$http({
          url: this.$http.adornUrl('/product/category/list/tree'),
          method: 'get'
        }).then(({data}) => {
          this.menuList = data.treeList
        })
      },
      submitData () {
        if (this.dialogType === 'edit') {
          this.editCategory()
        }
        if (this.dialogType === 'add') {
          this.addCategory()
        }
      },
      edit (data) {
        this.dialogType = 'edit'
        this.dialogVisible = true
        this.category.name = data.name
        this.title = '修改分类'
        this.$http({
          url: this.$http.adornUrl(`/product/category/info/${data.catId}`),
          method: 'get'
        }).then(({data}) => {
          console.log(data)
          this.category.name = data.data.name
          this.category.catId = +data.data.catId
          this.category.icon = data.data.icon
          this.category.productUnit = data.data.productUnit
          this.category.parentCid = data.data.parentCid
          this.category.catLevel = data.data.catLevel
          this.category.sort = data.data.sort
          this.category.showStatus = data.data.showStatus
        })
      },
      editCategory () {
        // eslint-disable-next-line no-unused-vars
        let { catId, name, icon, productUnit } = this.category
        this.$http({
          url: this.$http.adornUrl('/product/category/update'),
          method: 'post',
          data: this.$http.adornData({catId, name, icon, productUnit}, false)
        }).then(({data}) => {
          this.$message({
            message: '菜单修改成功',
            type: 'success'
          })
          this.dialogVisible = false
          this.getMenus()
          this.expandedKeys = [this.category.parentCid]
        })
      },
      append (data) {
        this.dialogType = 'add'
        this.dialogVisible = true
        this.title = '添加分类'
        this.category.parentCid = data.catId
        this.category.catLevel = +data.catLevel + 1
        this.category.name = ''
        this.category.catId = null
        this.category.icon = ''
        this.category.productUnit = ''
        this.category.sort = 0
        this.category.showStatus = 1
      },
      addCategory () {
        this.$http({
          url: this.$http.adornUrl('/product/category/save'),
          method: 'post',
          data: this.$http.adornData(this.category, false)
        }).then(({data}) => {
          this.$message({
            message: '保存成功',
            type: 'success'
          })
          this.dialogVisible = false
          this.getMenus()
          this.expandedKeys = [this.category.parentCid]
        })
      },
      remove (node, data) {
        let ids = [data.catId]
        this.$confirm(`是否删除[${data.name}]菜单 ?`, '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          this.$http({
            url: this.$http.adornUrl('/product/category/delete'),
            method: 'post',
            data: this.$http.adornData(ids, false)
          }).then(({data}) => {
            this.expandedKeys = [node.parent.data.catId]
            this.$message({
              message: '删除成功',
              type: 'success'
            })
            this.getMenus()
          })
        }).catch(() => {

        })
      }
    },
    created () {
      this.getMenus()
    }
  }
</script>

<style scoped>

</style>
