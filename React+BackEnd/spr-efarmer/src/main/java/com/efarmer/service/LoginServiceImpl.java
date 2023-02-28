package com.efarmer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efarmer.dao.LoginDao;
import com.efarmer.model.Login;



@Service
public class LoginServiceImpl implements LoginService
{
	@Autowired
	private LoginDao loginDao;
	
	@Override
	public void insert(Login user) 
	{
		loginDao.save(user);
		
	}

	@Override
	public boolean check(Login user) 
	{
		Login cUser=loginDao.checkUser(user.getFarmerName(),user.getFarmerPassword());
			if(cUser!=null &&user.getFarmerName().equals(cUser.getFarmerName()) && user.getFarmerPassword().equals(cUser.getFarmerPassword()))
				return true;
			else
				return false;
	}

}
