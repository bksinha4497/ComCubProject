package com.comviva.soap;

import com.comviva.kafka.*;

public class EmployeeDataImpl {

	public String insertEmployee(Employee emp) {

		Employee employee = new Employee();
		
		Producer kafkaProducer = new Producer();
		
		int employeeID = emp.getId();
		
		String employeeName = emp.getName();
		
		String EmployeeData = "comviva(" + employeeID + " , " + employeeName + ")";
		
		String successMessage = "Successfully Inserted Employee Details to Kafka";
		
		String failureMessage = "Kafka Server is down, please restart kafka server";
		
		String invalidNameMessage = "Please Enter valid Employee Name";

		boolean employeeNameValidness = employee.validateEmployeeName(employeeName);
		
		if (employeeNameValidness) {
			 boolean kafkaProducerResponse = kafkaProducer.sendMessage(EmployeeData);
			if(kafkaProducerResponse)
				return successMessage;
			else
				return failureMessage;

		} else
			return invalidNameMessage;

	}
}