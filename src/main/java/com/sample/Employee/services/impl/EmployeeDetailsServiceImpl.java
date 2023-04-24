package com.sample.Employee.services.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sample.Employee.web.*;
import com.sample.Employee.beans.EmployeeDetails;
import com.sample.Employee.repository.EmployeeDetailsRepository;
import com.sample.Employee.repository.EmployeeRepositoryCustom;
import com.sample.Employee.service.EmployeeDetailsService;

@Service
public class EmployeeDetailsServiceImpl implements EmployeeDetailsService {

	@Autowired
	EmployeeDetailsRepository employeeDetailsRepository;
	
	@Autowired
	EmployeeRepositoryCustom employeeRepositoryCustom;
	
	
	@Override
	public List<EmployeeDetails> getSearchAndSortEmployess(String employeeName, String employeeDepartment, String employeeDesignation, Double employeeSalary,
			String currentProject, Integer experience) {
		
		return employeeRepositoryCustom.searchEmployee(employeeName, employeeDepartment, employeeDesignation, employeeSalary, currentProject, experience);
		
	}
	

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
	 
		if (employeeDetails.isEmpty()) {
			throw new RuntimeException("(Employee Id cannot be find");
			
		}
		EmployeeDetails employeeDetail = employeeDetails.get();
		employeeDetail.setCurrent_project(upadteEmployeeDetail.getCurrent_project());
		employeeDetail.setEmp_department(upadteEmployeeDetail.getEmp_department());
		employeeDetail.setEmp_designation(upadteEmployeeDetail.getEmp_designation());
		employeeDetail.setEmp_name(upadteEmployeeDetail.getEmp_name());
		employeeDetail.setEmp_salary(upadteEmployeeDetail.getEmp_salary());
		employeeDetail.setExperience(upadteEmployeeDetail.getExperience());
		return employeeDetailsRepository.save(employeeDetail);
		
		}
@Override
public List<EmployeeDetails> retrieveEmployeesPagedAndSorted(int pageNo, int pageSize, String sortField, String sortDirection) {
		
		Sort sort = sortDirection.equalsIgnoreCase("asc") ? Sort.by(sortField).ascending() :
		     Sort.by(sortField).descending();
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		Page<EmployeeDetails> employees = employeeDetailsRepository.findAll(pageable);
		return employees.getContent();
	}

@Override
public List<EmployeeDetails> getAllEmployeeDetails() {
	List<EmployeeDetails> findAllEmployeeDetails = employeeDetailsRepository.findAll();
	return findAllEmployeeDetails;
}
	
	

	


}


	

