package com.promineotech.drinks.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Drink_order {
	private int orderid;
	private int cocktailid;
	private int ingredientid;
	private int spiritsid;

}
