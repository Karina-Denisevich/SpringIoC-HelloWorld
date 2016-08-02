package com.github.Karina_Denisevich.spring.hello_world.core;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorld {

    @Autowired(required=false)
    private Person person;
    private String value;
    private String value1;

    public void setValue(String value) {
        this.value = value;
    }

    public void setValue1(String name){
        this.value1 = name;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "person=" + person +
                ", value='" + value + '\'' +
                ", value1='" + value1 + '\'' +
                '}';
    }

    public void printHello() {
        System.out.println(value + value1);
    }


}
