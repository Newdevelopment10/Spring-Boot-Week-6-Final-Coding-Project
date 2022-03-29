package com.promineotech.drinks.controller;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.promineotech.drinks.entity.Cocktails;

@Validated
@RequestMapping("/Create-mixed-drink")
public interface DrinksOrderController {

	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping
//	Cocktails createCoctail(@RequestBody OrderRequest request; can instantiate a request if I want to)

	Cocktails createCocktail();
}

