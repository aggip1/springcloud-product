package com.ag.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="CART",url = "http://localhost:9002")
public interface Fegin {
    @RequestMapping("requestId")
    public String FeignRequestId(@RequestParam("id")String id);

}
