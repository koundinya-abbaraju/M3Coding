package com.cg.m1.question1.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="employee")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="employeeId")
public class Employee 
{
	@Id
	@Column(name="employee_id")
	private int employeeId;
	
	@Column(name="employee_name")
	private String employeeName;
	
	@Column(name="employee_salary")
	private double employeeSalary;
	
	@Column(name="employee_dob")
	private String employeeDOB;
	
	@OneToOne(mappedBy="employee",cascade=CascadeType.ALL)
	Address address;
	
	public Employee() {
		super();
	}
	public Employee(int employeeId, String employeeName, double employeeSalary, String employeeDOB,Address address) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeDOB = employeeDOB;
		this.address=address;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeDOB() {
		return employeeDOB;
	}
	public void setEmployeeDOB(String employeeDOB) {
		this.employeeDOB = employeeDOB;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
