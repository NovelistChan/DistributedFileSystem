package nju.czf.filesystem.services.datanode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableDiscoveryClient
@SpringBootApplication
public class DataNodeServer {

    public static void main(String args[]) {

        System.setProperty("spring.config.name", "datanode");

        SpringApplication.run(DataNodeServer.class, args);
    }
}
