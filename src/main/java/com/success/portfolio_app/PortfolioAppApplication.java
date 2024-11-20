package com.success.portfolio_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.success.portfolio_app"})
public class PortfolioAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioAppApplication.class, args);
	}

}
