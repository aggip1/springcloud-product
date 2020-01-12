package com.ag;

import com.ag.dao.ProductDao;
import com.ag.entity.ProductDto;
import com.ag.service.ProductServcie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ServerTests {

    @Autowired
    private ProductDao productDao;

    @Test
    public void contextLoads() {
        List<ProductDto> productDtos = productDao.queryProduct(11);
        for (ProductDto productDto : productDtos) {
            System.out.println(productDto);
        }

    }





}
