package com.ag.dao;

import com.ag.entity.ProductDto;
import com.ag.entity.ProductInfo;

import java.util.List;

public interface ProductDao {
     List<ProductDto> queryProduct(Integer id);

     //根据id查
     ProductInfo queryByIdProduct(String id);

     //根据id修改库存
     void updateStock(Integer quantity,String id);

}
