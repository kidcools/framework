package com.kidcools.sbmpdrredis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kidcools.sbmpdr.mapper")
public class SbMpDrRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbMpDrRedisApplication.class, args);
    }

}
