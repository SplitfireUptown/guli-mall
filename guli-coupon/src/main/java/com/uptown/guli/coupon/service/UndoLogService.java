package com.uptown.guli.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.uptown.common.utils.PageUtils;
import com.uptown.guli.coupon.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author uptown
 * @email lixiaofei@haizhi.com
 * @date 2020-11-21 12:24:12
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

