package com.promineotech.drinks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.drinks.dao.DrinksSalesDao;
import com.promineotech.drinks.entity.Cocktails;

@Service
public class DefaultDrinksSalesService implements DrinksSalesService {

	@Autowired
	private DrinksSalesDao drinksSalesDao;
	
	@Override
	public List<Cocktails> fetchCocktails() {
		return drinksSalesDao.fetchCocktails();
	}

}
