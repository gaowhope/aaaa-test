package com.eastmoney.aaaatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = AaaaTestApplication.class)
@EnableScheduling
@ComponentScan(basePackages = "com.eastmoney")
@EnableAutoConfiguration
@Configuration
public class AaaaTestApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(AaaaTestApplication.class, args);
    }

}
