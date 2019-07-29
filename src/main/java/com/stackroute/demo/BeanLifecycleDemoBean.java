package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @PostConstruct
    private void customInit() {
        System.out.println("After bean Initialization");
    }

    @PreDestroy
    private void customDestroy() {
        System.out.println("Before bean destroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Before destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After Properties set");
    }
}
