package com.yu.product.service.impl;

import com.yu.product.dataobject.ProductInfo;
import com.yu.product.enums.ProductStatusEnum;
import com.yu.product.repository.ProductInfoRepository;
import com.yu.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName ProductServiceImpl
 * Description TODO
 *
 * @Author hadoop
 * Date 2019/4/11 22:43
 **/
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
