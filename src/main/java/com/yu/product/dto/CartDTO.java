package com.yu.product.dto;

import lombok.Data;

/**
 * ClassName CartDTO
 * Description TODO
 *
 * @Author hadoop
 * Date 2019/7/14 21:16
 **/
@Data
public class CartDTO {

    //商品id
    private String productId;

    //商品数量
    private Integer productQuantity;

    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
