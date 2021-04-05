package com.boutique.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.boutique.common.utils.PageUtils;
import com.boutique.coupon.entity.SmsFlashsaleSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:27:13
 */
public interface SmsFlashsaleSkuRelationService extends IService<SmsFlashsaleSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

