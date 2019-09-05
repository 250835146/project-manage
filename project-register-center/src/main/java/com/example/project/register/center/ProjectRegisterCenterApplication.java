package com.example.project.register.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//开启注册中心
@EnableEurekaServer
public class ProjectRegisterCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectRegisterCenterApplication.class, args);
    }

}
