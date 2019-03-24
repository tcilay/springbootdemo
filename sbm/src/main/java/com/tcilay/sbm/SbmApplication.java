package com.tcilay.sbm;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tcilay.sbm.mapper")
public class SbmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbmApplication.class, args);
    }
}
