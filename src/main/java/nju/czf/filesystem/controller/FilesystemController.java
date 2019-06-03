package nju.czf.filesystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.logging.Logger;

@EnableEurekaServer
@RestController
public class FilesystemController {
    private final Logger logger = Logger.getLogger(FilesystemController.class.getName());
    
    @RequestMapping("/hello")
    public String home(){
        return "hello world";
    }
}
