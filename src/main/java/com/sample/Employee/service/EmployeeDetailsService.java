package com.sample.Employee.service;


import java.util.List;
import com.sample.Employee.beans.EmployeeDetails;
import com.sample.Employee.web.*;

public interface EmployeeDetailsService {
EmployeeDetails getEmployeeDetails (String empId);
void deleteEmployeeDetails(String empId);
EmployeeDetails createEmployeeDetail(CreateEmployeeDetails createEmployeeDetails);
EmployeeDetails upadteEmployeeDetail(UpdateEmployeeDetail updateEmployeeDetail);
List<EmployeeDetails> searchEmployessUsingCreiteria(String employeeName, String employeeDepartment, String employeeDesignation, Double employeeSalary, String currentProject, Integer experience);
List<EmployeeDetails> getAllEmployeeDetails();
List<EmployeeDetails> retrieveEmployeesPagedAndSorted(int pageNo, int pageSize, String sortField, String sortDirection);
}
