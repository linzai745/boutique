package com.boutique.coupon.dao;

import com.boutique.coupon.entity.SmsFlashsaleSkuNoticeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀商品通知订阅
 * 
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:27:13
 */
@Mapper
public interface SmsFlashsaleSkuNoticeDao extends BaseMapper<SmsFlashsaleSkuNoticeEntity> {
	
}
