package com.example.userapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * This is responsible for web layer configuration like
 * static resource , view resolver etc.
 * @author deeksha.sethi
 *
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= {"com.example"})
public class SpringWebConfig extends WebMvcConfigurerAdapter{
	
	
}
