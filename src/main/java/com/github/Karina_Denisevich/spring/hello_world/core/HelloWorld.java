package com.github.Karina_Denisevich.spring.hello_world.core;

public class HelloWorld {

    private String value;
    private String value1;

    public void setValue(String value) {
        this.value = value;
    }

    public void setValue1(String name){
        this.value1 = name;
    }

    public void printHello() {
        System.out.println(value + value1);
    }
}
