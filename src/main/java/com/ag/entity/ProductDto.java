package com.ag.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto implements Serializable {
    private String id;
    private String name;
    private Double price;
    private String description;
    private String icon;
}
