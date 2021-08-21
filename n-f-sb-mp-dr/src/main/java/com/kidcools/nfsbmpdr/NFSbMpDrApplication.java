package com.kidcools.nfsbmpdr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.kidcools.nfsbmpdr.mapper")
@EnableFeignClients("com.kidcools.nfsbmpdr.service")
public class NFSbMpDrApplication {

    public static void main(String[] args) {
        SpringApplication.run(NFSbMpDrApplication.class, args);
    }

}
