package com.khameleon.mvc.dao;



public interface UserLoginDao {
	public boolean fetchLoginDetails(String userName, String password);
}
