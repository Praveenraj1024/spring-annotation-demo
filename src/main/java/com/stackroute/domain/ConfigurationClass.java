package com.stackroute.domain;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
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


    @Scope("prototype")
    @Bean(name = {"movie1"})
    public Movie getMovie() {
        Movie movie1 = new Movie();
        return movie1;
    }

    @Bean(name = "lifeCycle")
    public BeanLifecycleDemoBean getBeanLife() {
        BeanLifecycleDemoBean beanLifecycleDemoBean = new BeanLifecycleDemoBean();
        return beanLifecycleDemoBean;
    }

    @Bean(name = "postProcessor")
    public BeanPostProcessorDemoBean getPostProcessor() {
        BeanPostProcessorDemoBean beanPostProcessorDemoBean = new BeanPostProcessorDemoBean();
        return beanPostProcessorDemoBean;
    }

}
