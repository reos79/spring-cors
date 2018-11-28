package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
			.allowedOrigins("http://localhost:9798")
			.allowedMethods("POST", "GET")
			//.allowedHeaders("header1", "header2", "header3")
			//.exposedHeaders("header1", "header2")
			.allowCredentials(true).maxAge(3600);
	}
}
