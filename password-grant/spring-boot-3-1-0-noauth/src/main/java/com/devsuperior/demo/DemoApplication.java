package com.devsuperior.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Override
	public void run(String...args) throws Exception{
		System.out.println("ENCODE = " + passwordEncoder.encode("123456"));
		
		boolean result = passwordEncoder.matches("123456", "$2a$10$5m7LVDZmt6FMZGF8JDEAYeGPDx5ZgkD7e3RfJ0vraaS1PGhl0ng1.");
		
		System.out.println("RESULTADO = " + result);
	}

	
}
