package com.yu.product.VO;

import lombok.Data;

/**
 * ClassName ResultVO
 * Description TODO
 *
 * @Author hadoop
 * Date 2019/4/11 23:04
 **/
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private  T data;
}
