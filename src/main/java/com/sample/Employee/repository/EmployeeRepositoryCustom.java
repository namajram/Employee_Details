package com.sample.Employee.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.Employee.beans.EmployeeDetails;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

@Repository
public class EmployeeRepositoryCustom {

	
	  @Autowired
	EntityManager em;
	
public List<EmployeeDetails> searchEmployee(String employeeName, String employeeDepartment, String employeeDesignation, Double employeeSalary, String currentProject, Integer experience
)
	
{
		CriteriaBuilder cb = em.getCriteriaBuilder();
	    CriteriaQuery<EmployeeDetails> cq = cb.createQuery(EmployeeDetails.class);

	    Root<EmployeeDetails> employee = cq.from(EmployeeDetails.class);
	    List<Predicate> predicates = new ArrayList<>();
	    
	    if (employeeName != null) {
	        predicates.add(cb.equal(employee.get("employeeName"), employeeName));
	    }
	    if (employeeDepartment != null) {
	        predicates.add(cb.equal(employee.get("employeeDepartment"), employeeDepartment));
	    }
	    if (employeeSalary != null) {
	        predicates.add(cb.equal(employee.get("employeeSalary"), employeeSalary));
	    }
	    if (currentProject != null) {
	        predicates.add(cb.equal(employee.get("currentProject"), currentProject));
	    }
	    if (experience != null) {
	        predicates.add(cb.equal(employee.get("experience"), experience));
	    }

	    
	    cq.where(predicates.toArray(new Predicate[predicates.size()]));

	    return em.createQuery(cq).getResultList();
	}
}
