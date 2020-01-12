package com.ag.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SuccessJson implements Serializable {
    private Integer code;
    private String msg;
    private List<com.ag.dto.Data> data;
}
