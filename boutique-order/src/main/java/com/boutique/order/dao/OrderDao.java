package com.boutique.order.dao;

import com.boutique.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:21:38
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
