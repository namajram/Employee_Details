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
		employeeDetail.setCurrentProject(createEmployeeDetails.getCurrentProject());
		employeeDetail.setEmployeeDepartment(createEmployeeDetails.getEmployeeDepartment());
		employeeDetail.setEmployeeDesignation(createEmployeeDetails.getEmployeeDesignation());
		employeeDetail.setEmployeeName(createEmployeeDetails.getEmployeeName());
		employeeDetail.setEmployeeSalary(createEmployeeDetails.getEmployeeSalary());
		employeeDetail.setExperience(createEmployeeDetails.getExperience());
		return employeeDetailsRepository.save(employeeDetail);
			
	}

	@Override
	public EmployeeDetails upadteEmployeeDetail(UpdateEmployeeDetail upadteEmployeeDetail) {
	 Optional<EmployeeDetails> employeeDetails = employeeDetailsRepository.findById(upadteEmployeeDetail.getEmployeeId());
	 
		if (employeeDetails.isEmpty()) {
			throw new RuntimeException("(Employee Id cannot be find");
			
		}
		EmployeeDetails employeeDetail = employeeDetails.get();
		employeeDetail.setCurrentProject(upadteEmployeeDetail.getCurrentProject());
		employeeDetail.setEmployeeDepartment(upadteEmployeeDetail.getEmployeeDepartment());
		employeeDetail.setEmployeeDesignation(upadteEmployeeDetail.getEmployeeDesignation());
		employeeDetail.setEmployeeName(upadteEmployeeDetail.getEmployeeName());
		employeeDetail.setEmployeeSalary(upadteEmployeeDetail.getEmployeeSalary());
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


	

