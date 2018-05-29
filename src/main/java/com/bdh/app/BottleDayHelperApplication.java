package com.bdh.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class BottleDayHelperApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BottleDayHelperApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BottleDayHelperApplication.class, args);
    }
}

