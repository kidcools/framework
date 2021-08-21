package com.kidcools.nfsbmpdr.controller;

import com.kldcools.common.util.R;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/echo/{msg}")
    public R echo(@PathVariable("msg") String msg){
        return R.ok("success").setData(msg);
    }
}
