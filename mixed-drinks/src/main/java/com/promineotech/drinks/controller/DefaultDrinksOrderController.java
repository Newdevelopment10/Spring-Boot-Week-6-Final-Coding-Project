package com.promineotech.drinks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.drinks.entity.Cocktails;
import com.promineotech.drinks.service.DrinksOrderService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DefaultDrinksOrderController implements DrinksOrderController {
	
	@Autowired
	private DrinksOrderService drinksOrderService;
// Can use order_request to create a class where different objects are taken in to make a mixed drink
// Refer to order_request in JeepSales for guidance
// Can pass parameters for request once objects are instantiated in a new class (order_request)
	@Override
	public Cocktails createCocktail() {
		log.info("Controller:");
		return drinksOrderService.createCocktail();
	}
}
