package com.stackroute;

import com.stackroute.domain.ConfigurationClass;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        Movie movie = applicationContext.getBean("movie1", Movie.class);
        Movie vedhalam = applicationContext.getBean("vedhalam", Movie.class);
        System.out.println(movie);
        System.out.println(vedhalam);
    }
}
