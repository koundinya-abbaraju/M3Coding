package com.cg.m1.question1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.m1.question1.entity.Employee;
import com.cg.m1.question1.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Transactional(readOnly=true)
	public Employee getByEmployeeId(int employeeId)
	{
		Optional<Employee> emp = employeeRepository.findById(employeeId);
		if(emp!=null)
			return emp.get();
		throw new RuntimeException("No employee by that name found");
	}
	
	@Transactional
	public boolean addEmployeeDetails(Employee employee)
	{
		Employee mov = employeeRepository.save(employee);
		return (mov!=null);
	}
	
	@Transactional
	public boolean modifyEmployeeDetails(Employee employee)
	{
		Employee mov = employeeRepository.save(employee);
		return (mov!=null);
	}
	
	@Transactional(readOnly=false)
	public void removeEmployeebyID(int employeeId)
	{
		employeeRepository.deleteById(employeeId);
	}
	
}
