package com.yiibai.tutorial.spring.helloworld.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.yiibai.tutorial.spring.helloworld.HelloWorld;

public class SpringHelloWorld implements HelloWorld {

    @Autowired
    private StrutsHelloWorld shw;
    public void sayHello() {
        System.out.println("Spring Say Hello!!");
    }

}
