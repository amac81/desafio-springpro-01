package com.bitclinic.desafio_springpro_01.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.bitclinic.desafio_springpro_01.entities.Order;

public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	public OrderService() {}
	
	public double total(Order order) {
		
		double shippmentValue = shippingService.shipment(order);
		
		//fazer calculo
		return 0.0;
	}

}
