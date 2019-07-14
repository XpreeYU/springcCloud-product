package com.yu.product.exception;

import com.yu.product.enums.ResultEnum;

/**
 * ClassName ProductException
 * Description TODO
 *
 * @Author hadoop
 * Date 2019/7/14 21:21
 **/
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

}
