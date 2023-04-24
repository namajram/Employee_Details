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


	public EmployeeDetails(long employeeId, String employeeName, String employeeDepartment, String employeeDesignation,
			double employeeSalary, String currentProject, int experience) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		this.employeeDesignation = employeeDesignation;
		this.employeeSalary = employeeSalary;
		this.currentProject = currentProject;
		this.experience = experience;
	}


	public long getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
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
		return "EmployeeDetails [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDepartment="
				+ employeeDepartment + ", employeeDesignation=" + employeeDesignation + ", employeeSalary="
				+ employeeSalary + ", currentProject=" + currentProject + ", experience=" + experience + "]";
	}
	
	
	
	
}
