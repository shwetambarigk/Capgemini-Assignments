package springrest_5.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "springrest_5.controllers, springrest_5.services")
@EnableAutoConfiguration
public class EmployeeApp {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApp.class, args);
	}
	
}