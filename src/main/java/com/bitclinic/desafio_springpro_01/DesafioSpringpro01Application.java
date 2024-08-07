package com.bitclinic.desafio_springpro_01;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bitclinic.desafio_springpro_01.entities.Order;
import com.bitclinic.desafio_springpro_01.services.OrderService;
import com.bitclinic.desafio_springpro_01.utils.Ui;

@SpringBootApplication
public class DesafioSpringpro01Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(DesafioSpringpro01Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		
		//Objeto Scanner para entrada de dados, a partir de System.in 
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("Dados do pedido\n");
		
		int codigo = Ui.askAndValidateIntInput("Código: ", sc, 0, 99999);
		double valorBasico = Ui.askAndValidateDoubleInput("Valor básico: ", sc);
		double porcentagemDesconto = Ui.askAndValidateDoubleInput("Porcentagem de Desconto: ", sc);
		
		Order order = new Order(codigo, valorBasico, porcentagemDesconto);
		
		System.out.println();
		System.out.println("Pedido código " + order.getCode());
		
		System.out.printf("Valor Total = R$ %.2f%n", orderService.total(order));
		
	}
}
