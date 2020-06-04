package com.karan.developer.SpringAngular;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = CarRepository.class)
public class SpringAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAngularApplication.class, args);
	}

	 @Bean
	    ApplicationRunner init(CarRepository repository) {
	        return args -> {
	            Stream.of("Ferrari", "Jaguar", "Porsche", "Lamborghini", "Bugatti",
	                      "AMC Gremlin", "Triumph Stag", "Ford Pinto", "Yugo GV").forEach(name -> {
	                Car car = new Car();
	                car.setName(name);
	                repository.save(car);
	            });
	            repository.findAll().forEach(System.out::println);
	        };
	    }
}
