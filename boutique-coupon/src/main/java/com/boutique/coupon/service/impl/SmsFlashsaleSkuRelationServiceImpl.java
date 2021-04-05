package com.boutique.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boutique.common.utils.PageUtils;
import com.boutique.common.utils.Query;

import com.boutique.coupon.dao.SmsFlashsaleSkuRelationDao;
import com.boutique.coupon.entity.SmsFlashsaleSkuRelationEntity;
import com.boutique.coupon.service.SmsFlashsaleSkuRelationService;


@Service("smsFlashsaleSkuRelationService")
public class SmsFlashsaleSkuRelationServiceImpl extends ServiceImpl<SmsFlashsaleSkuRelationDao, SmsFlashsaleSkuRelationEntity> implements SmsFlashsaleSkuRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsFlashsaleSkuRelationEntity> page = this.page(
                new Query<SmsFlashsaleSkuRelationEntity>().getPage(params),
                new QueryWrapper<SmsFlashsaleSkuRelationEntity>()
        );

        return new PageUtils(page);
    }

}