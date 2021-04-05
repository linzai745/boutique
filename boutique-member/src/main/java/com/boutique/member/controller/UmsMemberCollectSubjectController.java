package com.boutique.member.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.boutique.member.entity.UmsMemberCollectSubjectEntity;
import com.boutique.member.service.UmsMemberCollectSubjectService;
import com.boutique.common.utils.PageUtils;
import com.boutique.common.utils.R;



/**
 * 会员收藏的专题活动
 *
 * @author alin
 * @email rglin2020@gmail.com
 * @date 2021-01-21 22:28:17
 */
@RestController
@RequestMapping("member/umsmembercollectsubject")
public class UmsMemberCollectSubjectController {
    @Autowired
    private UmsMemberCollectSubjectService umsMemberCollectSubjectService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = umsMemberCollectSubjectService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		UmsMemberCollectSubjectEntity umsMemberCollectSubject = umsMemberCollectSubjectService.getById(id);

        return R.ok().put("umsMemberCollectSubject", umsMemberCollectSubject);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody UmsMemberCollectSubjectEntity umsMemberCollectSubject){
		umsMemberCollectSubjectService.save(umsMemberCollectSubject);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public R update(@RequestBody UmsMemberCollectSubjectEntity umsMemberCollectSubject){
		umsMemberCollectSubjectService.updateById(umsMemberCollectSubject);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		umsMemberCollectSubjectService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
