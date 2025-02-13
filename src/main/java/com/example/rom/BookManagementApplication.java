package com.example.rom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class BookManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookManagementApplication.class, args);
		
	}
		 @Bean
		    public BCryptPasswordEncoder passwordEncoder() {
		        return new BCryptPasswordEncoder();
		 }
	

}
