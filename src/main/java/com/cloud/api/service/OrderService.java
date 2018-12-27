package com.cloud.api.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/order")
public interface OrderService {
	@RequestMapping(value = "/getAllOrders", method = RequestMethod.GET)
	String getAllOrders();
}
