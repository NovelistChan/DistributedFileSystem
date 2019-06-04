package nju.czf.filesystem.services.datanode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DataNodeServer {
    public static void main(String args[]) {
        SpringApplication.run(DataNodeServer.class, args);
    }
}
