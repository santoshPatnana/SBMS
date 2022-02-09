package com.khameleon.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserLoginDaoImpl implements UserLoginDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean fetchLoginDetails(String userName, String password) {
		int count = jdbcTemplate.queryForObject("select count(*) from users_tab where username= ? and password = ?", Integer.class, userName, password);
		if(count == 1)
			return true;
		return false;
	}

}
