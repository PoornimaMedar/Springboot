package com.codingshuttle.poornima.week1Introduction.introductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "db.env", havingValue = "production")
public class prodDB implements dbInterface {

    public String getData(){
        return "Prod DB";
    }
}
