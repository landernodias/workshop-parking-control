package com.api.workshopparkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WorkshopParkingControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkshopParkingControlApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "Olá Mundo";
	}
}