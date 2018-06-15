package com.yiibai.tutorial.spring.helloworld.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.yiibai.tutorial.spring.helloworld.HelloWorld;

public class StrutsHelloWorld implements HelloWorld {

    @Autowired
    private SpringHelloWorld shw;
    public void sayHello() {
        System.out.println("Struts Say Hello!!");
    }

}
