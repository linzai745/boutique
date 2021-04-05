package com.boutique.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.boutique.common.utils.PageUtils;
import com.boutique.coupon.entity.SmsFlashsaleSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:27:13
 */
public interface SmsFlashsaleSessionService extends IService<SmsFlashsaleSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

