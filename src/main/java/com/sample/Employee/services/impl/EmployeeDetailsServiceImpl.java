package com.sample.Employee.services.impl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.Employee.beans.EmployeeData;
import com.sample.Employee.beans.EmployeeDetails;
import com.sample.Employee.repository.EmployeeDetailsRepository;
import com.sample.Employee.service.EmployeeDetailsService;

@Service
public class EmployeeDetailsServiceImpl implements EmployeeDetailsService {

	@Autowired
	EmployeeDetailsRepository edr;

	@Override
	public EmployeeDetails getEmployeeDetails(String empId) {
		Optional<EmployeeDetails> findById = edr.findById(empId);
		if (findById.isEmpty()) {
			throw new RuntimeException("(Id is not have");
			
		}
		return findById.get();
	}

	@Override
	public void deleteEmployeeDetails(String empId) {
		edr.deleteById(empId);		
	}

	

	@Override
	public EmployeeDetails EmployeeData(EmployeeData create) {
		
		EmployeeDetails ed = new EmployeeDetails();
		ed.setCurrent_project(create.getCurrent_project());
		ed.setEmp_department(create.getEmp_department());
		ed.setEmp_designation(create.getEmp_designation());
		ed.setEmp_name(create.getEmp_name());
		ed.setEmp_salary(create.getEmp_salary());
		ed.setExperience(create.getExperience());
		return edr.save(ed);
			
	}

	@Override
	public EmployeeDetails EmployeeDataUpdate(com.sample.Employee.beans.EmployeeDataUpdate upadte) {
	 Optional<EmployeeDetails> findById = edr.findById(upadte.getEmp_id());
	 EmployeeDetails details = findById.orElseThrow();
		if (findById.isEmpty()) {
			throw new RuntimeException("(Id is not have");
			
		}
		details.setCurrent_project(upadte.getCurrent_project());
		details.setEmp_department(upadte.getEmp_department());
		details.setEmp_designation(upadte.getEmp_designation());
		details.setEmp_name(upadte.getEmp_name());
		details.setEmp_salary(upadte.getEmp_salary());
		details.setExperience(upadte.getExperience());
		return edr.save(details);
		
		}
	
	
}


	

