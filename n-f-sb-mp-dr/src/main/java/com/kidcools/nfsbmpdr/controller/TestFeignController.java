package com.kidcools.nfsbmpdr.controller;


import com.kidcools.nfsbmpdr.service.TestFeignService;
import com.kldcools.common.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("feign")
public class TestFeignController {
    @Autowired
    TestFeignService feignService;
    @RequestMapping("/{msg}")
    public R test(@PathVariable("msg") String msg){
        R res = feignService.test(msg);
        return res;
    }
}
