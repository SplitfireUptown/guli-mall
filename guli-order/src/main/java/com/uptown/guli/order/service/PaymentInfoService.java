package com.uptown.guli.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.uptown.common.utils.PageUtils;
import com.uptown.guli.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author uptown
 * @email lixiaofei@haizhi.com
 * @date 2020-11-21 17:43:00
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

