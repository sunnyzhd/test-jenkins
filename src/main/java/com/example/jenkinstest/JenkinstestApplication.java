package com.example.jenkinstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//extends SpringBootServletInitializer
@SpringBootApplication
public class JenkinstestApplication  {

    public static void main(String[] args) {
        SpringApplication.run(JenkinstestApplication.class, args);
    }

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(JenkinstestApplication.class);
//    }
}
