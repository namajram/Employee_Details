package com.sample.Employee.services.impl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.Employee.web.*;
import com.sample.Employee.beans.EmployeeDetails;
import com.sample.Employee.repository.EmployeeDetailsRepository;
import com.sample.Employee.service.EmployeeDetailsService;

@Service
public class EmployeeDetailsServiceImpl implements EmployeeDetailsService {

	@Autowired
	EmployeeDetailsRepository employeeDetailsRepository;

	@Override
	public EmployeeDetails getEmployeeDetails(String empId) {
		Optional<EmployeeDetails> employeeDetail = employeeDetailsRepository.findById(empId);
		if (employeeDetail.isEmpty()) {
			throw new RuntimeException("(Employee Id cannot be find");
			
		}
		return employeeDetail.get();
	}
	

	@Override
	public void deleteEmployeeDetails(String empId) {
		employeeDetailsRepository.deleteById(empId);		
	}

	

	@Override
	public EmployeeDetails createEmployeeDetail(CreateEmployeeDetails createEmployeeDetails) {
		
		EmployeeDetails employeeDetail = new EmployeeDetails();
		employeeDetail.setCurrent_project(createEmployeeDetails.getCurrent_project());
		employeeDetail.setEmp_department(createEmployeeDetails.getEmp_department());
		employeeDetail.setEmp_designation(createEmployeeDetails.getEmp_designation());
		employeeDetail.setEmp_name(createEmployeeDetails.getEmp_name());
		employeeDetail.setEmp_salary(createEmployeeDetails.getEmp_salary());
		employeeDetail.setExperience(createEmployeeDetails.getExperience());
		return employeeDetailsRepository.save(employeeDetail);
			
	}

	@Override
	public EmployeeDetails upadteEmployeeDetail(UpdateEmployeeDetail upadteEmployeeDetail) {
	 Optional<EmployeeDetails> employeeDetails = employeeDetailsRepository.findById(upadteEmployeeDetail.getEmp_id());
	 EmployeeDetails employeeDetail = employeeDetails.get();
		if (employeeDetails.isEmpty()) {
			throw new RuntimeException("(Employee Id cannot be find");
			
		}
		employeeDetail.setCurrent_project(upadteEmployeeDetail.getCurrent_project());
		employeeDetail.setEmp_department(upadteEmployeeDetail.getEmp_department());
		employeeDetail.setEmp_designation(upadteEmployeeDetail.getEmp_designation());
		employeeDetail.setEmp_name(upadteEmployeeDetail.getEmp_name());
		employeeDetail.setEmp_salary(upadteEmployeeDetail.getEmp_salary());
		employeeDetail.setExperience(upadteEmployeeDetail.getExperience());
		return employeeDetailsRepository.save(employeeDetail);
		
		}
	
	
}


	

