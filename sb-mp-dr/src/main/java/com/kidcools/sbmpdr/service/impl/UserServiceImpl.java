package com.kidcools.sbmpdr.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kidcools.sbmpdr.domain.User;
import com.kidcools.sbmpdr.mapper.UserMapper;
import com.kidcools.sbmpdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> findUser(Integer pagenum, Integer pagesize) {
        Page<User> page = new Page<>(pagenum, pagesize);
        page = userMapper.selectPage(page, null);
        return page.getRecords();
    }
}
