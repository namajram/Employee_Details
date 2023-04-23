package com.sample.Employee.service;

import com.sample.Employee.beans.EmployeeData;
import com.sample.Employee.beans.EmployeeDetails;

public interface EmployeeDetailsService {
EmployeeDetails getEmployeeDetails (String empId);
void deleteEmployeeDetails(String empId);
EmployeeDetails EmployeeData(EmployeeData create);
EmployeeDetails EmployeeDataUpdate(com.sample.Employee.beans.EmployeeDataUpdate upadte);
}
