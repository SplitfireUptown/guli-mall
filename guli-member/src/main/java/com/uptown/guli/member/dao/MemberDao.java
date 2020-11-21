package com.uptown.guli.member.dao;

import com.uptown.guli.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author uptown
 * @email lixiaofei@haizhi.com
 * @date 2020-11-21 16:18:43
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
