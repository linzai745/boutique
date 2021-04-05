package com.boutique.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 秒杀活动商品关联
 * 
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:27:13
 */
@Data
@TableName("sms_flashsale_sku_relation")
public class SmsFlashsaleSkuRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 活动id
	 */
	private Long promotionId;
	/**
	 * 活动场次id
	 */
	private Long promotionSessionId;
	/**
	 * 商品id
	 */
	private Long skuId;
	/**
	 * 秒杀价格
	 */
	private BigDecimal flashsalePrice;
	/**
	 * 秒杀总量
	 */
	private BigDecimal flashsaleCount;
	/**
	 * 每人限购数量
	 */
	private BigDecimal flashsaleLimit;
	/**
	 * 排序
	 */
	private Integer flashsaleSort;

}
