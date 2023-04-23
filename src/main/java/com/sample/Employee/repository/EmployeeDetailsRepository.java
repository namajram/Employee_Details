package com.sample.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sample.Employee.beans.EmployeeDetails;

public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, String>{

	

}
