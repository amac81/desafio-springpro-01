package com.bitclinic.desafio_springpro_01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioSpringpro01Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafioSpringpro01Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

		System.out.print("OLA MUNDO !");
		
	}

}
