package com.boutique.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boutique.common.utils.PageUtils;
import com.boutique.common.utils.Query;

import com.boutique.coupon.dao.SmsFlashsaleSkuNoticeDao;
import com.boutique.coupon.entity.SmsFlashsaleSkuNoticeEntity;
import com.boutique.coupon.service.SmsFlashsaleSkuNoticeService;


@Service("smsFlashsaleSkuNoticeService")
public class SmsFlashsaleSkuNoticeServiceImpl extends ServiceImpl<SmsFlashsaleSkuNoticeDao, SmsFlashsaleSkuNoticeEntity> implements SmsFlashsaleSkuNoticeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsFlashsaleSkuNoticeEntity> page = this.page(
                new Query<SmsFlashsaleSkuNoticeEntity>().getPage(params),
                new QueryWrapper<SmsFlashsaleSkuNoticeEntity>()
        );

        return new PageUtils(page);
    }

}