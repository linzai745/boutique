package com.boutique.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.boutique.coupon.entity.SmsFlashsaleSkuNoticeEntity;
import com.boutique.coupon.service.SmsFlashsaleSkuNoticeService;
import com.boutique.common.utils.PageUtils;
import com.boutique.common.utils.R;



/**
 * 秒杀商品通知订阅
 *
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:27:13
 */
@RestController
@RequestMapping("coupon/smsflashsaleskunotice")
public class SmsFlashsaleSkuNoticeController {
    @Autowired
    private SmsFlashsaleSkuNoticeService smsFlashsaleSkuNoticeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsFlashsaleSkuNoticeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SmsFlashsaleSkuNoticeEntity smsFlashsaleSkuNotice = smsFlashsaleSkuNoticeService.getById(id);

        return R.ok().put("smsFlashsaleSkuNotice", smsFlashsaleSkuNotice);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody SmsFlashsaleSkuNoticeEntity smsFlashsaleSkuNotice){
		smsFlashsaleSkuNoticeService.save(smsFlashsaleSkuNotice);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public R update(@RequestBody SmsFlashsaleSkuNoticeEntity smsFlashsaleSkuNotice){
		smsFlashsaleSkuNoticeService.updateById(smsFlashsaleSkuNotice);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		smsFlashsaleSkuNoticeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
