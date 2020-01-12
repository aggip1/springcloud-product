package com.ag.service;

import com.ag.dto.Data;
import com.ag.entity.ProductInfo;

import javax.servlet.http.HttpSession;
import java.util.List;


public interface ProductServcie {
    List<Data> queryProduct11(Integer id, HttpSession session);
    //根据id查
    ProductInfo queryByIdProduct(String id);

    //根据id修改库存
    void updateStock(Integer quantity,String id);
}
