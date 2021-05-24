package springrest_3.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="springrest_3.controllers, springrest_3.services")
@EnableAutoConfiguration
public class StateApp {
	
	public static void main(String[] args) {
		SpringApplication.run(StateApp.class, args);
	}
	
}