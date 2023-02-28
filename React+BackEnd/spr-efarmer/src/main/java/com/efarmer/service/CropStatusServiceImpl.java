package com.efarmer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efarmer.dao.CropStatusDao;
import com.efarmer.model.CropStatus;

@Service
public class CropStatusServiceImpl implements CropStatusService
{

	@Autowired
	private CropStatusDao cropStatusDao;
	
	@Override
	public void insertCrop(CropStatus crop) 
	{
		crop.setStatus("Pending");
		cropStatusDao.save(crop);
	}

}
