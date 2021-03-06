package com.boutique.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.boutique.common.utils.PageUtils;
import com.boutique.coupon.entity.SmsSkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:27:13
 */
public interface SmsSkuFullReductionService extends IService<SmsSkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

