package com.mannat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ShopOnlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopOnlineApplication.class, args);
	}
	@Bean
	  public WebMvcConfigurer corsConfigurer() {
	      return new WebMvcConfigurer() {
	          @Override
	          public void addCorsMappings(CorsRegistry registry) {
	              registry.addMapping("/**").allowedOrigins("http://localhost:3000");
	          }
	      };
	  }

	@GetMapping("/")
	public String home() {
		return "home";
	}
}
