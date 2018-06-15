package com.yiibai.tutorial.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yiibai.tutorial.spring.aop.PuttingTool;
import com.yiibai.tutorial.spring.aop.Zhaobenshan;
import com.yiibai.tutorial.spring.helloworld.HelloWorld;
import com.yiibai.tutorial.spring.helloworld.HelloWorldService;

public class HelloProgram {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // HelloWorldService service = (HelloWorldService)
        // context.getBean("helloWorldService");
        //
        // HelloWorld hw = service.getHelloWorld();

        PuttingTool zhaoBenShan = (PuttingTool) context.getBean("zhaobenshan");

        System.out.println(zhaoBenShan.getClass().isInstance(Zhaobenshan.class));

        zhaoBenShan.putElephantToRefrigerator();

        // hw.sayHello();
    }
}