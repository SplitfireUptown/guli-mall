package com.uptown.guli.product.dao;

import com.uptown.guli.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author uptown
 * @email lixiaofei@haizhi.com
 * @date 2020-11-15 20:41:18
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
