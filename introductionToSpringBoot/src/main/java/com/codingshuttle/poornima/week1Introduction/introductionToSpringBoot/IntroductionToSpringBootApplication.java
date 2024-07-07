package com.codingshuttle.poornima.week1Introduction.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {

//    @Autowired
//	Apple apt1;
//
//	@Autowired
//	Apple apt2;

	@Autowired
	dbService db;

	public static void main(String[] args) {

		SpringApplication.run(IntroductionToSpringBootApplication.class, args);

//		Apple apt = new Apple();
//		apt.eatApple();

	}

	@Override
	public void run(String... args) throws Exception {
//		apt1.eatApple();
//		apt2.eatApple();
//
//		System.out.println(apt1.hashCode());
//		System.out.println(apt2.hashCode());

		System.out.println(db.getDbData());
	}
}
