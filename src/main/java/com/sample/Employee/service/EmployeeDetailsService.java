package com.sample.Employee.service;


import java.util.List;

import com.sample.Employee.beans.EmployeeDetails;
import com.sample.Employee.web.*;

public interface EmployeeDetailsService {
EmployeeDetails getEmployeeDetails (String empId);
void deleteEmployeeDetails(String empId);
EmployeeDetails createEmployeeDetail(CreateEmployeeDetails createEmployeeDetails);
EmployeeDetails upadteEmployeeDetail(UpdateEmployeeDetail updateEmployeeDetail);
List<EmployeeDetails> searchEmployessUsingCreiteria(String emp_name, String emp_department, String emp_designation, Double emp_salary, String current_project, Integer experience);

}
