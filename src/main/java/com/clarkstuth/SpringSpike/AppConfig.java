package com.clarkstuth.SpringSpike;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({ "com.clarkstuth.SpringSpike" })
@PropertySource("classpath:app.properties")
public class AppConfig {
	
	// this is required to make @PropertySource work with @Value statements on objects.
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
}