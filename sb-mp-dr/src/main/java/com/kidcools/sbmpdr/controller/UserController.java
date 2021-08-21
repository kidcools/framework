package com.kidcools.sbmpdr.controller;


import com.kidcools.sbmpdr.domain.User;
import com.kidcools.sbmpdr.service.UserService;
import com.kldcools.common.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/list/{pagenum}/{pagesize}")
    public R listUser(@PathVariable("pagenum") Integer  pageNum,@PathVariable("pagesize") Integer pagesize){
        List<User> users= userService.findUser(pageNum, pagesize);
        if(users!=null&&users.size()>0){
            return R.ok("获取成功").setData(users);
        }
        return R.ok("当前数据不存在");
    }
}
