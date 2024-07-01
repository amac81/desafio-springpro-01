package com.bitclinic.desafio_springpro_01.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitclinic.desafio_springpro_01.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	public OrderService() {}
	
	public double total(Order order) {
		
		double shippmentValue = shippingService.shipment(order);
		double discount = order.getBasic() * (order.getDiscount()/100);
		double orderTotal = order.getBasic() - discount + shippmentValue;
		
		return orderTotal;
	}

}
