package com.example.projectwebapiqicai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProjectWebapiQicaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectWebapiQicaiApplication.class, args);
    }

}
