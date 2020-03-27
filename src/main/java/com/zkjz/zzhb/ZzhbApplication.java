package com.zkjz.zzhb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.zkjz.zzhb.dao.mapper")
@SpringBootApplication
public class ZzhbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZzhbApplication.class, args);
    }

}
