package com.mtechlab.springitapp;

import com.mtechlab.springitapp.config.SpringitProperties;
import com.mtechlab.springitapp.domain.Comment;
import com.mtechlab.springitapp.domain.Link;
import com.mtechlab.springitapp.repository.CommetRepoository;
import com.mtechlab.springitapp.repository.LinkRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.util.logging.Logger;

@SpringBootApplication
@EnableConfigurationProperties(SpringitProperties.class)

public class SpringitappApplication {
    private  static  final Logger log = (Logger) LoggerFactory.getLogger(SpringitappApplication.class);
    @Autowired
    private SpringitProperties springitProperties;

    public static void main(String[] args) {
        SpringApplication.run(SpringitappApplication.class, args);
    }


//    @Profile("dev")
    @Bean
    CommandLineRunner runner(LinkRepository linkRepository, CommetRepoository commetRepoository){
        return args -> {
//            System.out.println("Hell profile");
            Link link = new Link("getting started with spring boot 2","https://spring.io/guides/gs/accessing-data-mysql/");
                    linkRepository.save(link);

            Comment comment = new Comment("THis is a first commet",link);
            commetRepoository.save(comment);

            link.addComment(comment);
//            System.out.println(link.toString());
//System.out.println(link.getComments());
System.out.println("We add just insert commets");
Link firstLink = linkRepository.findByTitle("getting started with spring boot 2");
firstLink.getTitle();
System.out.println(firstLink.getTitle());
                     };
    }
}

