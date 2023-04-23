package com.sample.Employee.web;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;





public class CreateEmployeeDetails {
	
 
	
	@NotEmpty(message = "The employee name is required.")
	@NotNull(message = "The employee name is required.")
	@Size(min = 3)
	private String emp_name;
	
	@NotEmpty(message = "The employee department is required.")
	@NotNull(message = "The employee department is required.")
	private String emp_department;
	
	@NotEmpty(message = "The employee designation is required.")
	@NotNull(message = "The employee designation is required.")
	private String emp_designation;
	
	@NotEmpty(message = "The employee salary is required.")
	@NotNull(message = "The employee salary is required.")
	private double emp_salary;
	
	@NotEmpty(message = "The employee current project is required.")
	@NotNull(message = "The employee current project is required.")
	private String current_project;
	
	
	private int experience;

	

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_department() {
		return emp_department;
	}

	public void setEmp_department(String emp_department) {
		this.emp_department = emp_department;
	}

	public String getEmp_designation() {
		return emp_designation;
	}

	public void setEmp_designation(String emp_designation) {
		this.emp_designation = emp_designation;
	}

	public double getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}

	public String getCurrent_project() {
		return current_project;
	}

	public void setCurrent_project(String current_project) {
		this.current_project = current_project;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public CreateEmployeeDetails() {}

	public CreateEmployeeDetails(String emp_id,
			@NotEmpty(message = "The employee name is required.") @NotNull(message = "The employee name is required.") String emp_name,
			@NotEmpty(message = "The employee department is required.") @NotNull(message = "The employee department is required.") String emp_department,
			@NotEmpty(message = "The employee designation is required.") @NotNull(message = "The employee designation is required.") String emp_designation,
			@NotEmpty(message = "The employee salary is required.") @NotNull(message = "The employee salary is required.") double emp_salary,
			@NotEmpty(message = "The employee current project is required.") @NotNull(message = "The employee current project is required.") String current_project,
			 int experience) {
		super();
		
		this.emp_name = emp_name;
		this.emp_department = emp_department;
		this.emp_designation = emp_designation;
		this.emp_salary = emp_salary;
		this.current_project = current_project;
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "EmployeeData [emp_name=" + emp_name + ", emp_department=" + emp_department + ", emp_designation="
				+ emp_designation + ", emp_salary=" + emp_salary + ", current_project=" + current_project
				+ ", experience=" + experience + "]";
	}

	
	
	
	
}
