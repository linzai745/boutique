package com.boutique.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.boutique.common.utils.PageUtils;
import com.boutique.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:11:47
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

