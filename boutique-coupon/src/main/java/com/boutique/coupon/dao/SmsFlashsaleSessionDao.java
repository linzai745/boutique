package com.boutique.coupon.dao;

import com.boutique.coupon.entity.SmsFlashsaleSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:27:13
 */
@Mapper
public interface SmsFlashsaleSessionDao extends BaseMapper<SmsFlashsaleSessionEntity> {
	
}
