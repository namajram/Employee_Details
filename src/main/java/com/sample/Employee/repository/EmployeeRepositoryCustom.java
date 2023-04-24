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
	
public List<EmployeeDetails> searchEmployee(String emp_name, String emp_department, String emp_designation, Double emp_salary, String current_project, Integer experience)
	
{
		CriteriaBuilder cb = em.getCriteriaBuilder();
	    CriteriaQuery<EmployeeDetails> cq = cb.createQuery(EmployeeDetails.class);

	    Root<EmployeeDetails> employee = cq.from(EmployeeDetails.class);
	    List<Predicate> predicates = new ArrayList<>();
	    
	    if (emp_name != null) {
	        predicates.add(cb.equal(employee.get("emp_name"), emp_name));
	    }
	    if (emp_department != null) {
	        predicates.add(cb.equal(employee.get("emp_department"), emp_department));
	    }
	    if (emp_salary != null) {
	        predicates.add(cb.equal(employee.get("emp_salary"), emp_salary));
	    }
	    if (current_project != null) {
	        predicates.add(cb.equal(employee.get("current_project"), current_project));
	    }
	    if (experience != null) {
	        predicates.add(cb.equal(employee.get("experience"), experience));
	    }
	    
	    cq.where(predicates.toArray(new Predicate[predicates.size()]));

	    return em.createQuery(cq).getResultList();
	}
}
