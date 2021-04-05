package com.boutique.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.boutique.common.utils.PageUtils;
import com.boutique.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:11:47
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

