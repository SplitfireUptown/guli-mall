package com.uptown.guli.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.uptown.common.utils.PageUtils;
import com.uptown.guli.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author uptown
 * @email lixiaofei@haizhi.com
 * @date 2020-11-21 17:43:00
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

