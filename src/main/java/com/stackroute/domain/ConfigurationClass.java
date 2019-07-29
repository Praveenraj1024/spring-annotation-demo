package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("literal-values.properties")
public class ConfigurationClass {
    @Autowired
    private Environment environment;
    @Bean(name = {"actor1"})
    public Actor getActor() {
        Actor actor1 = new Actor(environment.getProperty("actor1.name"),
                environment.getProperty("actor1.gender"),
                Integer.parseInt(environment.getProperty("actor1.age")));
        return actor1;
    }

    @Bean(name = {"actor2"})
    public Actor getAjith() {
        Actor actor1 = new Actor(environment.getProperty("actor2.name"),
                environment.getProperty("actor2.gender"),
                Integer.parseInt(environment.getProperty("actor2.age")));
        return actor1;
    }


    @Scope("prototype")
    @Bean(name = {"movie1", "movie2"})
    public Movie getMovie() {
        Movie movie1 = new Movie(getActor());
        return movie1;
    }

    @Bean(name = {"vedhalam"})
    public Movie getVedhalam() {
        Movie vedhalam = new Movie(getAjith());
        return vedhalam;
    }
}
