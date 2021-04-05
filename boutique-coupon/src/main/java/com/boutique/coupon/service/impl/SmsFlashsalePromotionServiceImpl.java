package com.boutique.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boutique.common.utils.PageUtils;
import com.boutique.common.utils.Query;

import com.boutique.coupon.dao.SmsFlashsalePromotionDao;
import com.boutique.coupon.entity.SmsFlashsalePromotionEntity;
import com.boutique.coupon.service.SmsFlashsalePromotionService;


@Service("smsFlashsalePromotionService")
public class SmsFlashsalePromotionServiceImpl extends ServiceImpl<SmsFlashsalePromotionDao, SmsFlashsalePromotionEntity> implements SmsFlashsalePromotionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsFlashsalePromotionEntity> page = this.page(
                new Query<SmsFlashsalePromotionEntity>().getPage(params),
                new QueryWrapper<SmsFlashsalePromotionEntity>()
        );

        return new PageUtils(page);
    }

}