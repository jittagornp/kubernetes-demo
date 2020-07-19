package me.jittagornp.example.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "me.jittagornp")
public class AppStarter {
    public static void main(String[] args) {
        SpringApplication.run(AppStarter.class, args);
    }
}