package com.spring.lazy.loading.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class MyConfiguration {
	
	@Bean
	@Lazy //We can delay the initialization
	public A getA(){
		
		return new A();
	}

	@Bean
	public B getB(){
		
		return new B();
	}
}
