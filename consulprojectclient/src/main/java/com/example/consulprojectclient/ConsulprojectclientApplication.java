package com.example.consulprojectclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConsulprojectclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulprojectclientApplication.class, args);
    }

}
