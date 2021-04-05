package com.boutique.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.boutique.common.utils.PageUtils;
import com.boutique.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:21:38
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

