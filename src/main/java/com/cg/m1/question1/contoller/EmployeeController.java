package com.cg.m1.question1.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.m1.question1.entity.Employee;
import com.cg.m1.question1.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController 
{
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(value="/{employeeId}",produces="application/json")
	public ResponseEntity<Employee> getEmployeeDetails(@PathVariable int employeeId)
	{
		Employee sb = employeeService.getByEmployeeId(employeeId);
		return  new ResponseEntity<Employee>(sb,HttpStatus.OK);
	} 

	@PostMapping(value="/addEmployee",consumes="application/json")
	public HttpStatus addEmployeeDetails(@RequestBody Employee employee)
	{
		if(employeeService.addEmployeeDetails(employee))
			return HttpStatus.OK;
		return HttpStatus.NOT_MODIFIED;
	}
	
	@PutMapping(value="/modify",consumes="application/json")
	public HttpStatus modifyEmployeeDetails(@RequestBody Employee employee)
	{
		if(employeeService.modifyEmployeeDetails(employee))
			return HttpStatus.OK;
		return HttpStatus.NOT_MODIFIED;	
	}

	@DeleteMapping(value="/delete/{employeeId}")
	public HttpStatus deleteEmployeeDetails(@PathVariable int employeeId)
	{
		employeeService.removeEmployeebyID(employeeId);
		return HttpStatus.OK;
	}
	
	@ExceptionHandler(RuntimeException.class)
	public HttpStatus exceptionHandlerMethod()
	{
		return HttpStatus.NO_CONTENT;
	}
	
}
