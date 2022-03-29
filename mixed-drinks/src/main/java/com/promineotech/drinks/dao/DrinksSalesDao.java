package com.promineotech.drinks.dao;

import java.util.List;

import com.promineotech.drinks.entity.Cocktails;

public interface DrinksSalesDao {

	List<Cocktails> fetchCocktails();

}
