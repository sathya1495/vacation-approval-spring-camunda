package com.vacation.project.storage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.vacation.project.domain.ApplicationConstants;
import com.vacation.project.domain.Employee;

public class EmployeeDAO {
	
	private static final Logger logger = LogManager.getLogger(EmployeeDAO.class);





	

	public boolean saveEmployeeData(Employee employee) {
		Connection connection =null;

		PreparedStatement preparedStatement =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//values hardcoded for understanding purpose
			connection = DriverManager.getConnection("jdbc:mysql://localhost:8080/mysql", "root", "admin");
			preparedStatement = connection.prepareStatement(ApplicationConstants.INSERT_QUERY);
			preparedStatement.setInt(1, employee.getId());
			preparedStatement.setString(2, employee.getFirstName());
			preparedStatement.setString(3, employee.getLastName());

			int value = preparedStatement.executeUpdate();
			logger.info("The db worked correctly " + value);
		} catch (SQLException | ClassNotFoundException exception) {
			exception.printStackTrace();
		}

		return false;
	}

}
