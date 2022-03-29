package com.promineotech.drinks.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Component;

import com.promineotech.drinks.entity.Cocktails;

@Component
public class DefaultDrinksOrderDao implements DrinksOrderDao {

	@Autowired
	
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	private SqlParams generateInsertSql(Cocktails cocktail) {
		SqlParams params = new SqlParams();

		// @formatter:off
	    params.sql = ""
	        + "INSERT INTO Cocktails ("
	        + "cocktail_id, cocktail_name, spirits_id"
	        + ") VALUES ("
	        + "5, Salty Irishman, 3"
	        + ")";
	    // @formatter:on

		params.source.addValue("cocktail_id", params);
		params.source.addValue("cocktail_name", params);
		params.source.addValue("spirits_id", params);

		return params;
	}
	
	@Override
	public Cocktails createCocktail() {
		// TODO Auto-generated method stub
		return null;
	}
		
	
	class SqlParams {
		String sql;
		MapSqlParameterSource source = new MapSqlParameterSource();
	}
		
		
}
