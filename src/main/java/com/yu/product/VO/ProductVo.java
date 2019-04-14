package com.yu.product.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * ClassName ProductVo
 * Description TODO
 *
 * @Author hadoop
 * Date 2019/4/11 23:06
 **/
@Data
public class ProductVo {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("food")
    List<ProductInfoVO> productInfoVOList;
}
