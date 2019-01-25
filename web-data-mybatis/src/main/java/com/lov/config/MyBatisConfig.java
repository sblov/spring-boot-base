package com.lov.config;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@MapperScan(value="com.lov.mapper")
@Configuration
public class MyBatisConfig {

	@Bean
	public ConfigurationCustomizer configurationCustomizer() {
		
		return (configuration)->{
//			开启驼峰命名
			configuration.setMapUnderscoreToCamelCase(true);
		};
		
	}
	
}
