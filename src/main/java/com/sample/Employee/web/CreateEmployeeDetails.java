package com.sample.Employee.web;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;





public class CreateEmployeeDetails {
	
 
	
	@NotEmpty(message = "The employee name is required.")
	@NotNull(message = "The employee name is required.")
	@Size(min = 3)
	private String employeeName;
	
	@NotEmpty(message = "The employee department is required.")
	@NotNull(message = "The employee department is required.")
	private String employeeDepartment;
	
	@NotEmpty(message = "The employee designation is required.")
	@NotNull(message = "The employee designation is required.")
	private String employeeDesignation;
	
	@NotNull(message = "The employee salary is required.")
	private double employeeSalary;
	
	@NotEmpty(message = "The employee current project is required.")
	@NotNull(message = "The employee current project is required.")
	private String currentProject;
	
	
	private int experience;

	

	public CreateEmployeeDetails() {
		
	}



	public CreateEmployeeDetails(
			@NotEmpty(message = "The employee name is required.") @NotNull(message = "The employee name is required.") @Size(min = 3) String employeeName,
			@NotEmpty(message = "The employee department is required.") @NotNull(message = "The employee department is required.") String employeeDepartment,
			@NotEmpty(message = "The employee designation is required.") @NotNull(message = "The employee designation is required.") String employeeDesignation,
			@NotNull(message = "The employee salary is required.") double employeeSalary,
			@NotEmpty(message = "The employee current project is required.") @NotNull(message = "The employee current project is required.") String currentProject,
			int experience) {
		super();
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		this.employeeDesignation = employeeDesignation;
		this.employeeSalary = employeeSalary;
		this.currentProject = currentProject;
		this.experience = experience;
	}



	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public String getEmployeeDepartment() {
		return employeeDepartment;
	}



	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}



	public String getEmployeeDesignation() {
		return employeeDesignation;
	}



	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}



	public double getEmployeeSalary() {
		return employeeSalary;
	}



	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}



	public String getCurrentProject() {
		return currentProject;
	}



	public void setCurrentProject(String currentProject) {
		this.currentProject = currentProject;
	}



	public int getExperience() {
		return experience;
	}



	public void setExperience(int experience) {
		this.experience = experience;
	}



	@Override
	public String toString() {
		return "CreateEmployeeDetails [employeeName=" + employeeName + ", employeeDepartment=" + employeeDepartment
				+ ", employeeDesignation=" + employeeDesignation + ", employeeSalary=" + employeeSalary
				+ ", currentProject=" + currentProject + ", experience=" + experience + "]";
	}
	
	
	

	
	
	
	
	
}
