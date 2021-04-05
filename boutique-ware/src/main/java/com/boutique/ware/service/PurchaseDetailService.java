package com.boutique.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.boutique.common.utils.PageUtils;
import com.boutique.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:23:03
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

