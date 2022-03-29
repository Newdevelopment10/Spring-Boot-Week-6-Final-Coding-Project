package com.promineotech.drinks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.drinks.dao.DrinksOrderDao;
import com.promineotech.drinks.entity.Cocktails;

@Service
public class DefaultDrinksOrderService implements DrinksOrderService {

	@Autowired
	private DrinksOrderDao drinksOrderDao; 
	
	@Override
	public Cocktails createCocktail() {
		return drinksOrderDao.createCocktail();
	}

}
