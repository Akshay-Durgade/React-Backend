package com.efarmer.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.efarmer.model.CropStatus;
import com.efarmer.service.CropStatusService;

@RestController
@CrossOrigin(value= {"http://localhost:3000"})
public class CropStatusController 
{
	@Autowired
	private CropStatusService cropStatusService;
	
	@PostMapping(value= {"/addCrop"})
	public void insertCrop(@RequestBody CropStatus crop)
	{
		cropStatusService.insertCrop(crop);
	}
}
