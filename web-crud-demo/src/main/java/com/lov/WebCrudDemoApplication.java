package com.lov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class WebCrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebCrudDemoApplication.class, args);
	}

}

