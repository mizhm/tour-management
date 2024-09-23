package com.group7.tourmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class TourManagementApplication {
	public static void main(String[] args) {
		SpringApplication.run(TourManagementApplication.class, args);
	}
}
