package com.yu.product.controller;

import com.yu.product.dto.CartDTO;
import com.yu.product.VO.ProductInfoVO;
import com.yu.product.VO.ProductVo;
import com.yu.product.VO.ResultVO;
import com.yu.product.dataobject.ProductCategory;
import com.yu.product.dataobject.ProductInfo;
import com.yu.product.service.CategoryService;
import com.yu.product.service.ProductService;
import com.yu.product.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *商品
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;
    /**
     * 1.查询所有在架的商品
     * 2.获取类目type列表
     * 3.查询类目
     * 4.构造数据
     */
    @GetMapping("/list")
    public ResultVO<ProductVo> list(){
        //1.查询所有在架的商品
        List<ProductInfo> productInfoList = productService.findUpAll();

        //2.获取类目type列表
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(ProductInfo::getCategoryType)
                .collect(Collectors.toList());

        //3.查询类目
        List<ProductCategory> categoryList = categoryService.findByCategoryTypeIn(categoryTypeList);

        //4.构造数据
        List<ProductVo> productVoList = new ArrayList<>();
        for ( ProductCategory productCategory: categoryList ) {
            ProductVo productVo = new ProductVo();
            productVo.setCategoryName(productCategory.getCategoryName());
            productVo.setCategoryType(productCategory.getCategoryType());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())){
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo,productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVo.setProductInfoVOList(productInfoVOList);
            productVoList.add(productVo);
        }

        return ResultVOUtil.sucess(productVoList);
    }

    /**
     * 获取商品列表（给订单服务使用的)
     * @param productIdList
     * @return
     */
    @PostMapping("listForOrder")
    public List<ProductInfo> listForOrder(@RequestBody List<String> productIdList){
        return  productService.findLsit(productIdList);
    }

    @PostMapping("/decreaseStock")
    public void decreaseStock(@RequestBody List<CartDTO> cartDTOList){
        productService.decreaseStock(cartDTOList);
    }
}
