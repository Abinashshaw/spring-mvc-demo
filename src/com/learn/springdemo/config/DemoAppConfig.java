package com.learn.springdemo.config;

import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.learn.springdemo")
public class DemoAppConfig implements WebMvcConfigurer{

	// define a bean for ViewResolver
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Bean
	public Map<String, String> operatingSystemsOptions() throws Exception {
		try(InputStream inputStream = getClass().getClassLoader().getResourceAsStream("../systems.properties")) {
			//load props file
			Properties props = new Properties();
			props.load(inputStream);
			
			// populate map with info from props
			Map<String, String> data = new TreeMap<String, String>((Map) props);
			
			return data;
		}
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Bean
	public Map<String, String> favouriteLanguageOptions() throws Exception {
		try(InputStream inputStream = getClass().getClassLoader().getResourceAsStream("../languages.properties")) {
			//load props file
			Properties props = new Properties();
			props.load(inputStream);
			
			// populate map with info from props
			Map<String, String> data = new TreeMap<String, String>((Map) props);
			
			return data;
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Bean
	public Map<String, String> countryOptions() throws Exception {
		try(InputStream inputStream = getClass().getClassLoader().getResourceAsStream("../countries.properties")) {
			//load props file
			Properties props = new Properties();
			props.load(inputStream);
			
			// populate map with info from props
			Map<String, String> data = new TreeMap<String, String>((Map) props);
			
			return data;
		}
	}
	

	@Bean
	public ViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
	@Override
	public void addResourceHandlers(
			org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addResourceHandler("/urlresources/**")
		.addResourceLocations("/resources/");
		
		WebMvcConfigurer.super.addResourceHandlers(registry);
	}
	

}









