package com.kidcools.sb.controller.service;

import com.kldcools.common.util.R;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
    @RequestMapping("/{info}")
    public R hello(@PathVariable String info){
        return R.ok("获取消息成功").setData(info);
    }
}
