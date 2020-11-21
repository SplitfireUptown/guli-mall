package com.uptown.guli.order.dao;

import com.uptown.guli.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author uptown
 * @email lixiaofei@haizhi.com
 * @date 2020-11-21 17:43:00
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
