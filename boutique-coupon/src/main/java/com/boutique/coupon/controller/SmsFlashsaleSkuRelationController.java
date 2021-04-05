package com.boutique.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.boutique.coupon.entity.SmsFlashsaleSkuRelationEntity;
import com.boutique.coupon.service.SmsFlashsaleSkuRelationService;
import com.boutique.common.utils.PageUtils;
import com.boutique.common.utils.R;



/**
 * 秒杀活动商品关联
 *
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:27:13
 */
@RestController
@RequestMapping("coupon/smsflashsaleskurelation")
public class SmsFlashsaleSkuRelationController {
    @Autowired
    private SmsFlashsaleSkuRelationService smsFlashsaleSkuRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsFlashsaleSkuRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SmsFlashsaleSkuRelationEntity smsFlashsaleSkuRelation = smsFlashsaleSkuRelationService.getById(id);

        return R.ok().put("smsFlashsaleSkuRelation", smsFlashsaleSkuRelation);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody SmsFlashsaleSkuRelationEntity smsFlashsaleSkuRelation){
		smsFlashsaleSkuRelationService.save(smsFlashsaleSkuRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public R update(@RequestBody SmsFlashsaleSkuRelationEntity smsFlashsaleSkuRelation){
		smsFlashsaleSkuRelationService.updateById(smsFlashsaleSkuRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		smsFlashsaleSkuRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
