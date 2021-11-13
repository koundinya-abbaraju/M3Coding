package com.cg.m1.question1.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="address")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="addressId")
public class Address 
{
	@Id
	@Column(name="address_id")
	private int addressId;
	
	@Column(name="street_name")
	private String streetName;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="employee_id")
	private int employeeId;
	
	@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="employee_id",insertable=false,updatable=false)
	Employee employee;
	
	public Address() {}
	public Address(int addressId, String streetName, String city, String state,int employeeId) 
	{
		this.addressId = addressId;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.employeeId = employeeId;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
}
