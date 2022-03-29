package com.promineotech.drinks.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.promineotech.drinks.entity.Cocktails;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DefaultDrinksSalesDao implements DrinksSalesDao {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public List<Cocktails> fetchCocktails() {
		log.info("Dao:");
		
		 String sql = "" + "SELECT * "  + "FROM cocktails " + "WHERE cocktail_id = :cocktail_id" 
				 + " AND cocktail_name = :cocktail_name" + " AND spirits_id = : spirits_id";
		
		 return jdbcTemplate.query(sql, new RowMapper<>() {
	
	 @Override
     public Cocktails mapRow(ResultSet rs, int rowNum) throws SQLException {
       //formatter:off
       
       return Cocktails.builder()
           .cocktailid(rs.getInt("cocktail_id"))
           .cocktail_name(rs.getString("cocktail_name"))
           .spiritsid(rs.getInt("spirits_id"))
           .build();
       //formatter:on
     }});
 }

}
