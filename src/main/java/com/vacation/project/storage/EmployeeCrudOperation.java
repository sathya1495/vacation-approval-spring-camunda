package com.vacation.project.storage;

import org.springframework.beans.factory.annotation.Autowired;

import com.vacation.project.domain.Employee;

public class EmployeeCrudOperation implements EmployeeCrudOp {

	@Override
	public boolean saveEmployeeData(Employee employee) {
  boolean status = false;
  EmployeeDAO employeeDAO=new EmployeeDAO();
		status = employeeDAO.saveEmployeeData(employee);
		
		
		return false;
	}

}
