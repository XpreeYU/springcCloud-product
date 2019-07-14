package com.yu.product.repository;

import com.yu.product.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * ClassName ProductInfoRepository
 * Description TODO
 *
 * @Author hadoop
 * Date 2019/4/10 23:31
 **/
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);

    List<ProductInfo> findByProductIdIn(List<String> productList);
}
