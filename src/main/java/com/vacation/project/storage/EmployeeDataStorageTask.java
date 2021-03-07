package com.vacation.project.storage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;

import com.vacation.project.domain.Employee;

public class EmployeeDataStorageTask implements JavaDelegate {
	private static final Logger logger = LogManager.getLogger(EmployeeDataStorageTask.class);


	@Override
	public void execute(DelegateExecution execution) throws Exception {

		String id = (String) execution.getVariable("employeeId");
		String firstName = (String) execution.getVariable("firstName");
		String lastName = (String) execution.getVariable("lastName");
			int id1=Integer.valueOf(id);
		logger.info("The id is " + id);
		logger.info("The First Name is " + firstName);
		logger.info("The Last Name is " + lastName);

		
		Employee employee = new Employee(id1,firstName,lastName);
		EmployeeCrudOperation crudOp = new EmployeeCrudOperation();
		boolean status=crudOp.saveEmployeeData(employee);
		execution.setVariable("isValidated", status);
	}

}
