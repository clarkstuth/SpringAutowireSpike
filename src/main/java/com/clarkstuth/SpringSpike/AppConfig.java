package com.clarkstuth.SpringSpike;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.clarkstuth.SpringSpike"})
@PropertySource("classpath:app.properties")
public class AppConfig {

	
	
}