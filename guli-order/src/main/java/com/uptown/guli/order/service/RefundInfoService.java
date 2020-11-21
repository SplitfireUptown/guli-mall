package com.uptown.guli.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.uptown.common.utils.PageUtils;
import com.uptown.guli.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author uptown
 * @email lixiaofei@haizhi.com
 * @date 2020-11-21 17:43:00
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

