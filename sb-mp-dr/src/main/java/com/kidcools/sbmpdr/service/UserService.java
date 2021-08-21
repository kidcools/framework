package com.kidcools.sbmpdr.service;

import com.kidcools.sbmpdr.domain.User;

import java.util.List;

public interface UserService {
    /**
     * 根据页码查询制定数量的用户列表
     * @param pagenum
     * @param pagesize
     * @return
     */
    List<User> findUser(Integer pagenum, Integer pagesize);
}
