package com.uptown.guli.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.uptown.common.utils.PageUtils;
import com.uptown.guli.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author uptown
 * @email lixiaofei@haizhi.com
 * @date 2020-11-15 20:41:18
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

