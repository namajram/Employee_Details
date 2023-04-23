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
	@Column(updatable = false, nullable = false)
	private long emp_id;
	
	
	@Column(updatable = true, nullable = false)
	private String emp_name;
	
	@Column(updatable = true, nullable = false)
	private String emp_department;
	
	
	@Column(updatable = true, nullable = false)
	private String emp_designation;
	
	
	@Column(updatable = true, nullable = false)
	private String emp_salary;
	

	@Column(updatable = true, nullable = false)
	private String current_project;
	
	
	@Column(updatable = true, nullable = false)
	private int experience;
	
	
	public EmployeeDetails() {
		
	}
	
	
	public EmployeeDetails(long emp_id, String emp_name, String emp_department, String emp_designation, String emp_salary,
			String current_project, int experience) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_department = emp_department;
		this.emp_designation = emp_designation;
		this.emp_salary = emp_salary;
		this.current_project = current_project;
		this.experience = experience;
	}


	public long getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}


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


	public String getEmp_salary() {
		return emp_salary;
	}


	public void setEmp_salary(String emp_salary) {
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


	@Override
	public String toString() {
		return "EmployeeData [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_department=" + emp_department
				+ ", emp_designation=" + emp_designation + ", emp_salary=" + emp_salary + ", current_project="
				+ current_project + ", experience=" + experience + "]";
	}

	
}
