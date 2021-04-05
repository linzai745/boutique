package com.boutique.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.boutique.common.utils.PageUtils;
import com.boutique.coupon.entity.SmsFlashsalePromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:27:13
 */
public interface SmsFlashsalePromotionService extends IService<SmsFlashsalePromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

