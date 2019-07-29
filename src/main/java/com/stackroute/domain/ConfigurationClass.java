package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
    @Bean(name = {"actor1"})
    public Actor getActor() {
        Actor actor1 = new Actor();
        actor1.setName("sk");
        actor1.setGender("male");
        actor1.setAge(36);
        return actor1;
    }

    @Bean(name = {"movie1"})
    public Movie getMovie() {
        Movie movie1 = new Movie();
        movie1.setActor(getActor());
        return movie1;
    }
}
