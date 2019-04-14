package com.yu.product.service.impl;

import com.yu.product.dataobject.ProductCategory;
import com.yu.product.repository.ProductCategoryRepository;
import com.yu.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName CategoryServiceImpl
 * Description TODO
 *
 * @Author hadoop
 * Date 2019/4/11 22:58
 **/
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
    }
}
