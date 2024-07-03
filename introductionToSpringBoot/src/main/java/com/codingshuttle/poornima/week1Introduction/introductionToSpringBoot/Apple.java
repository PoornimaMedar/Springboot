package com.codingshuttle.poornima.week1Introduction.introductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


public class Apple {

    public void eatApple(){
        System.out.println("I am eating an Apple");
    }

    @PostConstruct
    public void callThisBeforeAppleUse(){
        System.out.println("Creating Apple before use");
    }

    @PreDestroy
    void callThisBeforeDestroy(){
        System.out.println("Destoying Apple class now");
    }
}
