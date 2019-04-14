package com.serviceLocator.factoryBean.ServiceLocatorFactoryBean.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serviceLocator.factoryBean.ServiceLocatorFactoryBean.dto.PaymentRequest;
import com.serviceLocator.factoryBean.ServiceLocatorFactoryBean.service.PaymentRegistry;

@RestController
@RequestMapping("/cart-payment")
public class PaymentController {

	@Autowired
	PaymentRegistry payregi;
	
	@PostMapping("/pay")
	public String doPayment(@RequestBody PaymentRequest request) {
		String response = "";
		return response = payregi.getSeviceBean(request.getPaymentMethod()).pay(request);
	}
}
