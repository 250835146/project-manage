package com.example.projectserviceqicai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//要扫描mapper类包的路径
@MapperScan({"com.example.projectserviceqicai.dao"})
public class ProjectServiceQicaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectServiceQicaiApplication.class, args);
    }

}
