package com.kidcools.sbmpdr;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kidcools.sbmpdr.mapper")
public class SbMpDrApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbMpDrApplication.class, args);
    }

}
