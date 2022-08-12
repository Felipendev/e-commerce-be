package br.com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ECommerceBeApplication {

	@GetMapping
	public String getHomeTeste() {
		return "E-commerce - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(ECommerceBeApplication.class, args);
	}

}
