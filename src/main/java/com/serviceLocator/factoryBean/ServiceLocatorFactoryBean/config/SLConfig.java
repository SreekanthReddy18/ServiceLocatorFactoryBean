package com.serviceLocator.factoryBean.ServiceLocatorFactoryBean.config;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.serviceLocator.factoryBean.ServiceLocatorFactoryBean.service.PaymentRegistry;

@Component
public class SLConfig {

	@Bean
	public FactoryBean<?> getBean() {
		
     ServiceLocatorFactoryBean slFb = new ServiceLocatorFactoryBean();
      slFb.setServiceLocatorInterface(PaymentRegistry.class);
      return slFb;
	}
}
