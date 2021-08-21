package com.kidcools.nfsbmpdr2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NFSbMpDr2Application {

    public static void main(String[] args) {
        SpringApplication.run(NFSbMpDr2Application.class, args);
    }

}
