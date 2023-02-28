package com.efarmer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.efarmer.model.CropStatus;

@Repository
public interface CropStatusDao extends JpaRepository<CropStatus, Integer>, CrudRepository<CropStatus, Integer>
{
	
}
