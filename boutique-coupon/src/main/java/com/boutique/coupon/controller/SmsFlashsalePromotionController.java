package com.boutique.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.boutique.coupon.entity.SmsFlashsalePromotionEntity;
import com.boutique.coupon.service.SmsFlashsalePromotionService;
import com.boutique.common.utils.PageUtils;
import com.boutique.common.utils.R;



/**
 * 秒杀活动
 *
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:27:13
 */
@RestController
@RequestMapping("coupon/smsflashsalepromotion")
public class SmsFlashsalePromotionController {
    @Autowired
    private SmsFlashsalePromotionService smsFlashsalePromotionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsFlashsalePromotionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SmsFlashsalePromotionEntity smsFlashsalePromotion = smsFlashsalePromotionService.getById(id);

        return R.ok().put("smsFlashsalePromotion", smsFlashsalePromotion);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody SmsFlashsalePromotionEntity smsFlashsalePromotion){
		smsFlashsalePromotionService.save(smsFlashsalePromotion);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public R update(@RequestBody SmsFlashsalePromotionEntity smsFlashsalePromotion){
		smsFlashsalePromotionService.updateById(smsFlashsalePromotion);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		smsFlashsalePromotionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
