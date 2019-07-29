package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;

public class Actor {

    private String name;
    private String gender;
    private int age;


    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

//    @Value("${actor1.name}")
    public void setName(String name) {
        this.name = name;
    }

//    @Value("${actor1.gender}")
    public void setGender(String gender) {
        this.gender = gender;
    }

//    @Value("${actor1.age}")
    public void setAge(int age) {
        this.age = age;
    }
}
