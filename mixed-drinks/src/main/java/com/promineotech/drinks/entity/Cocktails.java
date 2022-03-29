package com.promineotech.drinks.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cocktails {
	
	private int cocktailid;
	private String cocktail_name;
	private int spiritsid;

}
