package com.boutique.ware.dao;

import com.boutique.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:23:03
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
