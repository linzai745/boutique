package com.boutique.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.boutique.common.utils.PageUtils;
import com.boutique.member.entity.UmsMemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:28:17
 */
public interface UmsMemberReceiveAddressService extends IService<UmsMemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

