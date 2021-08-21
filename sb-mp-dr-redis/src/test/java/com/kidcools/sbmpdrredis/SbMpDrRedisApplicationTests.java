package com.kidcools.sbmpdrredis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class SbMpDrRedisApplicationTests {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    @Test
    void contextLoads() {

    }
    @Test
    public void testAddKey(){
        redisTemplate.opsForValue().set("userename","kidcools");
    }

}
