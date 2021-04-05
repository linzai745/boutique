package com.boutique.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.boutique.common.utils.PageUtils;
import com.boutique.member.entity.UmsMemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:28:17
 */
public interface UmsMemberService extends IService<UmsMemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

