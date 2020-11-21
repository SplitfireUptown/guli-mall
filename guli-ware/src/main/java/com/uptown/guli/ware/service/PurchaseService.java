package com.uptown.guli.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.uptown.common.utils.PageUtils;
import com.uptown.guli.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author uptown
 * @email lixiaofei@haizhi.com
 * @date 2020-11-21 17:52:15
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

