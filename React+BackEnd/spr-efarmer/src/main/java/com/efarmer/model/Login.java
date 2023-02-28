package com.efarmer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="farmerID")
	int ID;
	@Column(name="farmerName",length=50)
	String farmerName;
	@Column(name="farmerMobNo",length=10)
	String farmerMobNo;
	@Column(name="farmerAadharNo",length=12)
	String farmerAadharNo;
	@Column(name="farmerDistrict",length=20)
	String farmerDistrict;
	@Column(name="farmerCity",length=20)
	String farmerCity;
	@Column(name="farmerPassword",length=16)
	String farmerPassword;
	@Column(name="farmerRole",length=10)
	String farmeRole="farmer";
	
	
	public String getFarmerName() {
		return farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}
	public String getFarmerMobNo() {
		return farmerMobNo;
	}
	public void setFarmerMobNo(String farmerMobNo) {
		this.farmerMobNo = farmerMobNo;
	}
	public String getFarmerAadharNo() {
		return farmerAadharNo;
	}
	public void setFarmerAadharNo(String farmerAadharNo) {
		this.farmerAadharNo = farmerAadharNo;
	}
	public String getFarmerDistrict() {
		return farmerDistrict;
	}
	public void setFarmerDistrict(String farmerDistrict) {
		this.farmerDistrict = farmerDistrict;
	}
	public String getFarmerCity() {
		return farmerCity;
	}
	public void setFarmerCity(String farmerCity) {
		this.farmerCity = farmerCity;
	}
	public String getFarmerPassword() {
		return farmerPassword;
	}
	public void setFarmerPassword(String farmerPassword) {
		this.farmerPassword = farmerPassword;
	}
	public String getFarmeRole() {
		return farmeRole;
	}
	public void setFarmeRole(String farmeRole) {
		this.farmeRole = farmeRole;
	}
	public int getID() {
		return ID;
	}
	
	
}


/*
 	{
    "farmerName":"Akshay",
    "farmerMobNo":"8108266719",
    "farmerAadharNo":"123456789123",
    "farmerDistrict":"Satara",
    "farmerCity":"Shirwal",
    "farmerPassword":"Akshay@16",
    "farmerRole":"farmer"
	}
 */
