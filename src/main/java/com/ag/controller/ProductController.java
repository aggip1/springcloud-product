package com.ag.controller;

import com.ag.dto.Data;
import com.ag.dto.SuccessJson;
import com.ag.entity.ProductInfo;
import com.ag.feign.Fegin;
import com.ag.service.ProductServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductServcie productServcie;

    @RequestMapping("list")
    public SuccessJson list(HttpSession session) {
        List<Data> data = productServcie.queryProduct11(11, session);
        SuccessJson successJson = new SuccessJson();
        successJson.setCode(0);
        successJson.setMsg("成功");
        successJson.setData(data);
        return successJson;
    }

    @Autowired
    private Fegin fegin;

    @RequestMapping("requestCart")
    public String requestCart(String id) {
        //调用方法
        String s = fegin.FeignRequestId(id);
        return s;
    }

    @RequestMapping("queryProductById")
    public ProductInfo queryProductById(String id) {
        ProductInfo productInfo = productServcie.queryByIdProduct(id);
        return productInfo;
    }

    @RequestMapping("update")
    public void update(Integer quantity, String id) {
        productServcie.updateStock(quantity, id);
        System.out.println("修改成功+=====");
    }
}
