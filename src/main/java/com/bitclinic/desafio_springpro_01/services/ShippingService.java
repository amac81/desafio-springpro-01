package com.bitclinic.desafio_springpro_01.services;

import org.springframework.stereotype.Service;

import com.bitclinic.desafio_springpro_01.entities.Order;

@Service
public class ShippingService {
	
	public ShippingService() {}
	
	public double shipment(Order order) {
		
		double shipmentValue = 0.0;
		
		if (order.getBasic() > 100.00 && order.getBasic() < 200.00) {
			shipmentValue = 12.00;
		}
		else if (order.getBasic() < 100.00) {
			shipmentValue = 20.00;
		}
	
		return shipmentValue;
	}

}
