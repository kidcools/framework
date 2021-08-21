package com.kidcools.nfsbmpdr2.controller;

import com.kldcools.common.util.R;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("feign")
public class TestController {
    @RequestMapping("/{msg}")
    public R test(@PathVariable("msg") String msg){
        return R.ok("success").setData(msg);
    }
}
