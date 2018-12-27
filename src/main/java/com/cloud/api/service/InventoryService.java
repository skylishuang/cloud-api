package com.cloud.api.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/inventory")
public interface InventoryService {
	@RequestMapping(value = "/getAllInventory", method = RequestMethod.GET)
	String getAllInventory();
}
