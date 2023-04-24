package com.sample.Employee.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee_Details")
public class EmployeeDetails {
	@Id
	@GeneratedValue
	@Column(name = "emp_id",updatable = false, nullable = false)
	private long employeeId;
	
	
	@Column(name = "emp_name",updatable = true, nullable = false)
	private String employeeName;
	
	@Column(name = "emp_department",updatable = true, nullable = false)
	private String employeeDepartment;
	
	
	@Column(name = "emp_designation",updatable = true, nullable = false)
	private String employeeDesignation;
	
	
	@Column(name = "emp_salary",updatable = true, nullable = false)
	private double employeeSalary;
	

	@Column(name = "current_project",updatable = true, nullable = false)
	private String currentProject;
	
	
	@Column(name = "experience",updatable = true, nullable = false)
	private int experience;
	
	
	public EmployeeDetails() {
		
	}
	
	
	public EmployeeDetails(long employeeId, String employeeName, String employeeDepartment, String employeeDesignation, double employeeSalary,
			String currentProject, int experience) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		this.employeeDesignation = employeeDesignation;
		this.employeeSalary = employeeSalary;
		this.currentProject = currentProject;
		this.experience = experience;
	}


	public long getEmp_id() {
		return employeeId;
	}


	public void setEmp_id(long emp_id) {
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


	@Override
	public String toString() {
		return "EmployeeData [emp_id=" + employeeId + ", emp_name=" + employeeName + ", emp_department=" + employeeDepartment
				+ ", emp_designation=" + employeeDesignation + ", emp_salary=" + employeeSalary + ", current_project="
				+ currentProject + ", experience=" + experience + "]";
	}

	
}
