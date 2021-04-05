package com.boutique.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.boutique.common.utils.PageUtils;
import com.boutique.member.entity.UmsIntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:28:17
 */
public interface UmsIntegrationChangeHistoryService extends IService<UmsIntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

