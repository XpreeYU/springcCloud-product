package com.yu.product.service;

import com.yu.product.dto.CartDTO;
import com.yu.product.dataobject.ProductInfo;

import java.util.List;

/**
 * ClassName ProductService
 * Description TODO
 *
 * @Author hadoop
 * Date 2019/4/11 22:37
 **/
public interface ProductService {
    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfo> findLsit(List<String> productIdList);

    /**
     *扣库存
     */
    void decreaseStock(List<CartDTO> cartDTOList);

}
