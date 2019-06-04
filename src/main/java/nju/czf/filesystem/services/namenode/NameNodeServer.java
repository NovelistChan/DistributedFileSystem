package nju.czf.filesystem.services.namenode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NameNodeServer {

    public static void main(String[] args) {

        System.setProperty("spring.config.name", "namenode");

        SpringApplication.run(NameNodeServer.class, args);
    }
}
