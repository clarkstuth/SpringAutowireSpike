package com.clarkstuth.SpringSpike;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConsoleRunner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		GenericService service = context.getBean(GenericService.class);
		
		service.doSomething();
	}

}
