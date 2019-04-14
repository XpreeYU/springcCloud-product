package com.yu.product.utils;

import com.yu.product.VO.ResultVO;

/**
 * ClassName ResultVOUtil
 * Description TODO
 *
 * @Author hadoop
 * Date 2019/4/11 23:54
 **/
public class ResultVOUtil {

    public static ResultVO sucess(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return  resultVO;
    }
}
