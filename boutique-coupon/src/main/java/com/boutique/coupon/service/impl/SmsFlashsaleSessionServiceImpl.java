package com.boutique.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boutique.common.utils.PageUtils;
import com.boutique.common.utils.Query;

import com.boutique.coupon.dao.SmsFlashsaleSessionDao;
import com.boutique.coupon.entity.SmsFlashsaleSessionEntity;
import com.boutique.coupon.service.SmsFlashsaleSessionService;


@Service("smsFlashsaleSessionService")
public class SmsFlashsaleSessionServiceImpl extends ServiceImpl<SmsFlashsaleSessionDao, SmsFlashsaleSessionEntity> implements SmsFlashsaleSessionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsFlashsaleSessionEntity> page = this.page(
                new Query<SmsFlashsaleSessionEntity>().getPage(params),
                new QueryWrapper<SmsFlashsaleSessionEntity>()
        );

        return new PageUtils(page);
    }

}