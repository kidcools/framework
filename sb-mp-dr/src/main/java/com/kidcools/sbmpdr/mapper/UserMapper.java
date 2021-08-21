package com.kidcools.sbmpdr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kidcools.sbmpdr.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
