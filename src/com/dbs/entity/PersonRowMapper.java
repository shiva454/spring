package com.dbs.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonRowMapper implements RowMapper<Person> {

	@Override
	public Person mapRow(ResultSet rs , int rowNum) throws SQLException {
		 
		Person person=new Person();
		person.setId( rs.getInt("id"));
		person.setName( rs.getString("name"));
		person.setSalary( rs.getDouble("salary"));
		return person;
	}

}
