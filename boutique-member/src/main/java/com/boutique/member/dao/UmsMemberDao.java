package com.boutique.member.dao;

import com.boutique.member.entity.UmsMemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:28:17
 */
@Mapper
public interface UmsMemberDao extends BaseMapper<UmsMemberEntity> {
	
}
