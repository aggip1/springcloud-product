package com.ag.dto;

import com.ag.entity.ProductDto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@lombok.Data
public class Data implements Serializable {
    private String name;
    private Integer type;
    private List<ProductDto> foods;
}
