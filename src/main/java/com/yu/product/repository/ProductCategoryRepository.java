package com.yu.product.repository;

import com.yu.product.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * ClassName ProductCategoryRepository
 * Description TODO
 *
 * @Author hadoop
 * Date 2019/4/10 23:48
 **/
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
