package com.sample.Employee.service;


import com.sample.Employee.beans.EmployeeDetails;
import com.sample.Employee.web.*;

public interface EmployeeDetailsService {
EmployeeDetails getEmployeeDetails (String empId);
void deleteEmployeeDetails(String empId);
EmployeeDetails createEmployeeDetail(CreateEmployeeDetails createEmployeeDetails);
EmployeeDetails upadteEmployeeDetail(UpdateEmployeeDetail updateEmployeeDetail);
}
