package com.clarkstuth.SpringSpike;

import java.io.IOException;
import java.util.Properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class ConsoleRunner {

	public static void main(String[] args) throws IOException {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class)) {

			// this is how you get Spring properties if you need to debug
			Properties properties = PropertiesLoaderUtils
					.loadProperties(new ClassPathResource("app.properties"));
			System.out.println(properties.getProperty("myProperty"));

			GenericService service = context.getBean(GenericService.class);
			service.doSomething();
		}
	}

}
