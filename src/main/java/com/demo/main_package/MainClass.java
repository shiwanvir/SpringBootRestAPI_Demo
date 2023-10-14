package com.demo.main_package;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//1 . @SpringBootApplication will let compiler know there is s spring application 
@SpringBootApplication
public class MainClass {

	public static void main (String [] args) {
		
		//2.SpringApplication.run() static method initiate this spring boot project.
		SpringApplication.run(MainClass.class, args);
		
		System.out.println("Hello I'am running");
	}
	
}
