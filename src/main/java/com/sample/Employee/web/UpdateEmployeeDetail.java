package com.sample.Employee.web;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UpdateEmployeeDetail {
	
	private String employeeId;
	
	@NotEmpty(message = "The employee name is required.")
	@NotNull(message = "The employee name is required.")
	@Size(min = 3, message = "")
	private String employeeName;
	
	@NotEmpty(message = "The employee department is required.")
	@NotNull(message = "The employee department is required.")
	private String employeeDepartment;
	
	@NotEmpty(message = "The employee designation is required.")
	@NotNull(message = "The employee designation is required.")
	private String employeeDesignation;
	
	@NotEmpty(message = "The employee salary is required.")
	@NotNull(message = "The employee salary is required.")
	private double employeeSalary;
	
	@NotEmpty(message = "The employee current project is required.")
	@NotNull(message = "The employee current project is required.")
	private String currentProject;
	
	
	private int experience;


	public String getEmp_id() {
		return employeeId;
	}


	public void setEmp_id(String emp_id) {
		this.employeeId = emp_id;
	}


	public String getEmp_name() {
		return employeeName;
	}


	public void setEmp_name(String emp_name) {
		this.employeeName = emp_name;
	}


	public String getEmp_department() {
		return employeeDepartment;
	}


	public void setEmp_department(String emp_department) {
		this.employeeDepartment = emp_department;
	}


	public String getEmp_designation() {
		return employeeDesignation;
	}


	public void setEmp_designation(String emp_designation) {
		this.employeeDesignation = emp_designation;
	}


	public double getEmp_salary() {
		return employeeSalary;
	}


	public void setEmp_salary(double emp_salary) {
		this.employeeSalary = emp_salary;
	}


	public String getCurrent_project() {
		return currentProject;
	}


	public void setCurrent_project(String current_project) {
		this.currentProject = current_project;
	}


	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}


	public UpdateEmployeeDetail() {}
	
	public UpdateEmployeeDetail(String emp_id,
			@NotEmpty(message = "The employee name is required.") @NotNull(message = "The employee name is required.") String emp_name,
			@NotEmpty(message = "The employee department is required.") @NotNull(message = "The employee department is required.") String emp_department,
			@NotEmpty(message = "The employee designation is required.") @NotNull(message = "The employee designation is required.") String emp_designation,
			@NotEmpty(message = "The employee salary is required.") @NotNull(message = "The employee salary is required.") double emp_salary,
			@NotEmpty(message = "The employee current project is required.") @NotNull(message = "The employee current project is required.") String current_project,
			int experience) {
		super();
		this.employeeId = emp_id;
		this.employeeName = emp_name;
		this.employeeDepartment = emp_department;
		this.employeeDesignation = emp_designation;
		this.employeeSalary = emp_salary;
		this.currentProject = current_project;
		this.experience = experience;
	}


	@Override
	public String toString() {
		return "EmployeeDataUpdate [emp_id=" + employeeId + ", emp_name=" + employeeName + ", emp_department=" + employeeDepartment
				+ ", emp_designation=" + employeeDesignation + ", emp_salary=" + employeeSalary + ", current_project="
				+ currentProject + ", experience=" + experience + "]";
	}

	
}
