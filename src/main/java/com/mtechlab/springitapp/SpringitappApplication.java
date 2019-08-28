package com.mtechlab.springitapp;

import com.mtechlab.springitapp.config.SpringitProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableConfigurationProperties(SpringitProperties.class)

public class SpringitappApplication {
    @Autowired
    private SpringitProperties springitProperties;

    public static void main(String[] args) {
        SpringApplication.run(SpringitappApplication.class, args);
    }


    @Profile("dev")
    @Bean
    CommandLineRunner runner(){
        return args -> {
            System.out.println("Hell profile");
//            System.out.println("welcome message" + springitProperties.getWelcome());
        };
    }
}

