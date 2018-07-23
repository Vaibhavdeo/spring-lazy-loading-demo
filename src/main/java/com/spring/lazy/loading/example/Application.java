package com.spring.lazy.loading.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	
	public static void main(String[] args) {
		
		//AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext();
		
		context.register(MyConfiguration.class);
		
		context.refresh();
		
		context.getBean("getA");//When we need it will initialize automatically
	}

}
