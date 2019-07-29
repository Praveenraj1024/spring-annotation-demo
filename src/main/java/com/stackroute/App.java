package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.ConfigurationClass;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        Movie movie1 = applicationContext.getBean("movie1", Movie.class);
//        BeanLifecycleDemoBean beanLifecycleDemoBean = applicationContext.getBean("lifeCycle", BeanLifecycleDemoBean.class);
        ((AbstractApplicationContext)applicationContext).destroy();
        System.out.println(movie1);
    }
}
