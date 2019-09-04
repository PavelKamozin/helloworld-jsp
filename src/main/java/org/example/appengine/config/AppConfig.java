package org.example.appengine.config;

import org.example.appengine.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.appengine.*")
public class AppConfig {

    @Bean(name = "testPerson")
    public Person person() {
        return new Person("John");
    }
}
