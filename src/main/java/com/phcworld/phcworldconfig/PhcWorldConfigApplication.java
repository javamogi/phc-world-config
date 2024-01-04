package com.phcworld.phcworldconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PhcWorldConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhcWorldConfigApplication.class, args);
    }

}
