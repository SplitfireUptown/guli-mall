package com.uptown.guli.order.dao;

import com.uptown.guli.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author uptown
 * @email lixiaofei@haizhi.com
 * @date 2020-11-21 17:43:00
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
