package com.boutique.ware.dao;

import com.boutique.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:23:03
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
