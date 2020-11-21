package com.uptown.guli.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.uptown.common.utils.PageUtils;
import com.uptown.guli.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author uptown
 * @email lixiaofei@haizhi.com
 * @date 2020-11-21 17:52:15
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

