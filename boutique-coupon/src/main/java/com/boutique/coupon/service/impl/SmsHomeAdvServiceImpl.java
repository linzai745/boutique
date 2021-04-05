package com.boutique.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boutique.common.utils.PageUtils;
import com.boutique.common.utils.Query;

import com.boutique.coupon.dao.SmsHomeAdvDao;
import com.boutique.coupon.entity.SmsHomeAdvEntity;
import com.boutique.coupon.service.SmsHomeAdvService;


@Service("smsHomeAdvService")
public class SmsHomeAdvServiceImpl extends ServiceImpl<SmsHomeAdvDao, SmsHomeAdvEntity> implements SmsHomeAdvService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsHomeAdvEntity> page = this.page(
                new Query<SmsHomeAdvEntity>().getPage(params),
                new QueryWrapper<SmsHomeAdvEntity>()
        );

        return new PageUtils(page);
    }

}