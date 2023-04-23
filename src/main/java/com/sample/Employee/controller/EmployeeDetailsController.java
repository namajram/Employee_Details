package com.sample.Employee.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.sample.Employee.web.*;
import com.sample.Employee.beans.EmployeeDetails;

import com.sample.Employee.service.EmployeeDetailsService;

import jakarta.validation.Valid;

@RestController
public class EmployeeDetailsController {
	@Autowired
	EmployeeDetailsService employeeDetailsService;
	
	
@GetMapping("employee/{id}")
public ResponseEntity<EmployeeDetails> getEmployeeDetails(@PathVariable String id) {
	EmployeeDetails employeeDetails = employeeDetailsService.getEmployeeDetails(id);
	return new ResponseEntity<EmployeeDetails>(employeeDetails, HttpStatus.OK);
}
@PostMapping("employee")
public ResponseEntity<EmployeeDetails> createEmployeeDetails(@RequestBody @Valid CreateEmployeeDetails createEmployeeDetail){
	EmployeeDetails employeeDetails = employeeDetailsService.createEmployeeDetail(createEmployeeDetail);
	return new ResponseEntity<EmployeeDetails>(employeeDetails , HttpStatus.CREATED);
	
}

@PutMapping("employee")
public ResponseEntity<com.sample.Employee.beans.EmployeeDetails> updateEmployeeDetails(@RequestBody @Valid UpdateEmployeeDetail updateEmployeeDetail){
	EmployeeDetails update = employeeDetailsService.upadteEmployeeDetail(updateEmployeeDetail);
	return new ResponseEntity<EmployeeDetails>(update , HttpStatus.OK);
	}

@DeleteMapping("employee/{id}")
public ResponseEntity<String> EmployeeDetails(@PathVariable String id) {
	employeeDetailsService.deleteEmployeeDetails(id);
	return new ResponseEntity<>("Employee detail is delete", HttpStatus.OK);
}
}
