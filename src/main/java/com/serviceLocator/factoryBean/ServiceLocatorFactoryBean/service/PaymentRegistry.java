package com.serviceLocator.factoryBean.ServiceLocatorFactoryBean.service;

public interface PaymentRegistry {

	public PaymentService getSeviceBean(String serviceName);
}
