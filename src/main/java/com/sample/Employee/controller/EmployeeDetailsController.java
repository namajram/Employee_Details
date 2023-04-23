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

import com.sample.Employee.beans.EmployeeData;
import com.sample.Employee.beans.EmployeeDataUpdate;
import com.sample.Employee.beans.EmployeeDetails;

import com.sample.Employee.service.EmployeeDetailsService;

import jakarta.validation.Valid;

@RestController
public class EmployeeDetailsController {
	@Autowired
	EmployeeDetailsService eds;
	
	
@GetMapping("employee/{id}")
public ResponseEntity<EmployeeDetails> getEmployeeDetails(@PathVariable String id) {
	EmployeeDetails employeeDetails = eds.getEmployeeDetails(id);
	return new ResponseEntity<EmployeeDetails>(employeeDetails, HttpStatus.OK);
}
@PostMapping("employee")
public ResponseEntity<String> createEmployeeDetails(@RequestBody @Valid EmployeeData ed){
	EmployeeDetails data = eds.EmployeeData(ed);
	return new ResponseEntity<>(data +"is created", HttpStatus.CREATED);
	
}

@PutMapping("employee")
public ResponseEntity<String> updateEmployeeDetails(@RequestBody @Valid EmployeeDataUpdate ed){
	EmployeeDetails update = eds.EmployeeDataUpdate(ed);
	return new ResponseEntity<>(update +"is update", HttpStatus.CREATED);
	}

@DeleteMapping("employee/{id}")
public ResponseEntity<EmployeeDetails> EmployeeDetails(@PathVariable String id) {
	eds.deleteEmployeeDetails(id);
	return new ResponseEntity<EmployeeDetails>(HttpStatus.OK);
}
}
