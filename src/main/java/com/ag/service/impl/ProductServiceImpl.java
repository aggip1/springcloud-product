package com.ag.service.impl;

import com.ag.dao.ProductDao;
import com.ag.dto.Data;
import com.ag.entity.ProductDto;
import com.ag.entity.ProductInfo;
import com.ag.service.ProductServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductServcie {

    @Autowired
    private ProductDao productDao;
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Data> queryProduct11(Integer id, HttpSession session) {
        List<Data> data1 = new ArrayList<>();
        List<ProductDto> productDtos = productDao.queryProduct(11);
        Data data = new Data();
        data.setType(1);
        data.setName("好吃");
        data.setFoods(productDtos);
        data1.add(data);
        List<ProductDto> productDtos1 = productDao.queryProduct(22);
        Data data2 = new Data();
        data2.setType(2);
        data2.setName("推荐");
        data2.setFoods(productDtos1);
        data1.add(data2);
        return data1;

    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public ProductInfo queryByIdProduct(String id) {
        ProductInfo productInfo = productDao.queryByIdProduct(id);
        return productInfo;
    }

    @Override
    public void updateStock(Integer quantity, String id) {
        productDao.updateStock(quantity,id );
    }

}
