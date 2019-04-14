package com.serviceLocator.factoryBean.ServiceLocatorFactoryBean.service;

import com.serviceLocator.factoryBean.ServiceLocatorFactoryBean.dto.PaymentRequest;

public interface PaymentService {
	
  public String pay(PaymentRequest request);
}
