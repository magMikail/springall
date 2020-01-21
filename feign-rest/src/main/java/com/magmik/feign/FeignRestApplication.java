package com.magmik.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FeignRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignRestApplication.class, args);
    }

}
