package com.uptown.guli.coupon.dao;

import com.uptown.guli.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author uptown
 * @email lixiaofei@haizhi.com
 * @date 2020-11-21 12:24:12
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
