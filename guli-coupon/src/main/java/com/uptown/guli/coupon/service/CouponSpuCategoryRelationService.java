package com.uptown.guli.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.uptown.common.utils.PageUtils;
import com.uptown.guli.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author uptown
 * @email lixiaofei@haizhi.com
 * @date 2020-11-21 12:24:12
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

