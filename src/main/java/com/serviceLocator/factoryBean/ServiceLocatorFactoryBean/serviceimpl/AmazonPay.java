package com.serviceLocator.factoryBean.ServiceLocatorFactoryBean.serviceimpl;

import org.springframework.stereotype.Service;

import com.serviceLocator.factoryBean.ServiceLocatorFactoryBean.dto.PaymentRequest;
import com.serviceLocator.factoryBean.ServiceLocatorFactoryBean.service.PaymentService;

@Service("AmazonPay")
public class AmazonPay implements PaymentService {

	@Override
	public String pay(PaymentRequest request) {
		String str = "Amount "+request.getAmount()+" paid by using AmazonPay";
		return str;
	}

}
