package com.lov.config;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyServerConfig implements WebMvcConfigurer {

	//server定制器
	@Bean
	public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> webServerFactoryCustomizer(){
		
		return (ConfigurableServletWebServerFactory factory)->{factory.setPort(8090);};
//				new WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>() {
//
//			@Override
//			public void customize(ConfigurableServletWebServerFactory factory) {
//				factory.setPort(8090);
//				
//			}
//		};
		
	}
	

	
}
