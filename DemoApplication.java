package com.nokia.oss.neo.hackathon.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages={"com.nokia.oss.neo.hackathon.demo"})
@RestController
@EnableAutoConfiguration
public class DemoApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello, you are at root2!";
    }

    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(DemoApplication.class, args);
    }
}