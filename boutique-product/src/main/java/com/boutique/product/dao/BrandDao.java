package com.boutique.product.dao;

import com.boutique.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:11:47
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {

    int updateStatusById(Long brandId, Integer status);

}
