package com.codingshuttle.poornima.week1Introduction.introductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "db.env", havingValue = "development")
public class devDB implements dbInterface {

    public String getData(){
        return "Dev data";
    }
}
