package com.yu.product.service;

import com.yu.product.dto.CartDTO;
import com.yu.product.ProductApplicationTests;
import com.yu.product.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductServiceTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> list = productService.findUpAll();
        Assert.assertTrue( list.size() > 0);
    }

    @Test
    public void findList() throws Exception {
        List<ProductInfo> list = productService.findLsit(Arrays.asList("157875196366160022", "157875227953464068"));
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void decreaseStock() throws Exception{
        CartDTO cartDTO = new CartDTO("157875196366160022", 2);
        productService.decreaseStock(Arrays.asList(cartDTO));
    }
}