package com.github.Karina_Denisevich.spring.hello_world.core;

public class HelloWorld {

    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public void printHello() {
        System.out.println(value);
    }
}
