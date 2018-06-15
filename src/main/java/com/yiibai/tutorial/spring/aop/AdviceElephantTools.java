package com.yiibai.tutorial.spring.aop;

public class AdviceElephantTools {

    public void before() {
        System.out.println("打开冰箱门。。。");
    }

    public void after() {
        System.out.println("关上冰箱门。。。");
    }

    public void on() {
        System.out.println("把大象塞进冰箱");
    }

}