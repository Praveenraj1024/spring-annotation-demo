package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("literal-values.properties")
public class ConfigurationClass {
    @Autowired
    private Environment environment;
    @Bean(name = {"actor1"})
    public Actor getActor() {
        Actor actor1 = new Actor();
        actor1.setName(environment.getProperty("actor1.name"));
        actor1.setGender(environment.getProperty("actor1.gender"));
        actor1.setAge(Integer.parseInt(environment.getProperty("actor1.age")));
        return actor1;
    }

    @Bean(name = {"actor2"})
    public Actor getAjith() {
        Actor actor1 = new Actor();
        actor1.setName(environment.getProperty("actor2.name"));
        actor1.setGender(environment.getProperty("actor2.gender"));
        actor1.setAge(Integer.parseInt(environment.getProperty("actor2.age")));
        return actor1;
    }


    @Bean(name = {"movie1"})
    public Movie getMovie() {
        Movie movie1 = new Movie();
        movie1.setActor(getActor());
        return movie1;
    }

    @Bean(name = {"vedhalam"})
    public Movie getVedhalam() {
        Movie vedhalam = new Movie();
        vedhalam.setActor(getAjith());
        return vedhalam;
    }
}
