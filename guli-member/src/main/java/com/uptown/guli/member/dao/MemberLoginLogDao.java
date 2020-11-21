package com.uptown.guli.member.dao;

import com.uptown.guli.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author uptown
 * @email lixiaofei@haizhi.com
 * @date 2020-11-21 16:18:42
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
