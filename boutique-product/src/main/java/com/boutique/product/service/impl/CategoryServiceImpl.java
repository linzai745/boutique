package com.boutique.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boutique.common.utils.PageUtils;
import com.boutique.common.utils.Query;

import com.boutique.product.dao.CategoryDao;
import com.boutique.product.entity.CategoryEntity;
import com.boutique.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // 查询出所有的分类
        List<CategoryEntity> categoryList = baseMapper.selectList(null);
        //构造树结构列表
        List<CategoryEntity> tree = new LinkedList<>();

        for (CategoryEntity category : categoryList) {
            Long parentCid = category.getParentCid();
            if (parentCid != null && parentCid == 0) {
                findChildren(category, categoryList);
                tree.add(category);
            }
        }

        return tree;
    }

    private void findChildren(CategoryEntity root, List<CategoryEntity> entities) {
        List<CategoryEntity> result = new LinkedList<>();

        for (CategoryEntity entity : entities) {
            if (root.getCatId().equals(entity.getParentCid())) {
                findChildren(entity, entities);
                result.add(entity);
            }
        }

        root.setChildren(result);
    }

}