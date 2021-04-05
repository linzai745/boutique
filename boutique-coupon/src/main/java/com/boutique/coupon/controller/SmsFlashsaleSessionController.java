package com.boutique.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.boutique.coupon.entity.SmsFlashsaleSessionEntity;
import com.boutique.coupon.service.SmsFlashsaleSessionService;
import com.boutique.common.utils.PageUtils;
import com.boutique.common.utils.R;



/**
 * 秒杀活动场次
 *
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:27:13
 */
@RestController
@RequestMapping("coupon/smsflashsalesession")
public class SmsFlashsaleSessionController {
    @Autowired
    private SmsFlashsaleSessionService smsFlashsaleSessionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsFlashsaleSessionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SmsFlashsaleSessionEntity smsFlashsaleSession = smsFlashsaleSessionService.getById(id);

        return R.ok().put("smsFlashsaleSession", smsFlashsaleSession);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody SmsFlashsaleSessionEntity smsFlashsaleSession){
		smsFlashsaleSessionService.save(smsFlashsaleSession);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public R update(@RequestBody SmsFlashsaleSessionEntity smsFlashsaleSession){
		smsFlashsaleSessionService.updateById(smsFlashsaleSession);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		smsFlashsaleSessionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
