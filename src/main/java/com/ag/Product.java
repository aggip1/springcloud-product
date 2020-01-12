package com.ag;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.ag.dao")
@EnableFeignClients
public class Product {

    public static void main(String[] args) {
        SpringApplication.run(Product.class, args);
    }

}
