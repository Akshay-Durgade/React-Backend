package com.efarmer.service;

import com.efarmer.model.Login;

public interface LoginService 
{
	void insert(Login user);
	boolean check(Login user);
}
