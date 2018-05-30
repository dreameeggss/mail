package com.wx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Hello world!
 *
 */

@SpringBootApplication(scanBasePackages = "com.wx")
@EnableScheduling
@EnableAutoConfiguration
public class App {
    public static void main(String[] args) {
        SpringApplication application=new SpringApplication(App.class);
        application.run(args);
    }
}
