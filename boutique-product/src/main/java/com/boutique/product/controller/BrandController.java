package com.boutique.product.controller;

import java.util.Arrays;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.boutique.product.entity.BrandEntity;
import com.boutique.product.service.BrandService;
import com.boutique.common.utils.PageUtils;
import com.boutique.common.utils.R;



/**
 * 品牌
 *
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:11:47
 */
@RestController
@RequestMapping("product/brand")
@Slf4j
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = brandService.queryPage(params);

        return R.ok().put("data", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{brandId}")
    public R info(@PathVariable("brandId") Long brandId){
		BrandEntity brand = brandService.getById(brandId);

        return R.ok().put("data", brand);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody BrandEntity brand){
		brandService.save(brand);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public R update(@RequestBody BrandEntity brand){
		brandService.updateById(brand);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public R delete(@RequestBody Long[] brandIds){
		brandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

    @PutMapping("/update/showStatus/{brandId}")
    public R updateShowStatus(@PathVariable("brandId") Long brandId, @RequestBody Integer status) {
        log.info("品牌ID: {}，状态： {}", brandId, status);
        brandService.updateStatusById(brandId, status);
        return R.ok();
    }
}
