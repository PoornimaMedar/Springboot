package com.codingshuttle.poornima.week1Introduction.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class dbService {

//    field dependency
//    @Autowired
//    private dbInterface db;

//    Constructor dependency
    final private dbInterface db;

    public dbService(dbInterface db){
        this.db=db;
    }

    String getDbData(){
        return db.getData();
    }


}
