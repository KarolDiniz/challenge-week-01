package controller;

import java.util.ArrayList;

import model.Employee;
import model.Salary;

public class EmployeeController {
	
	ArrayList<Employee> employees = new ArrayList<Employee>();	
	
	public void registerEmployee(String firstName, String lastName, float valueSalary) {		
		Salary salary = new Salary(valueSalary);
		Employee employee = new Employee(firstName, lastName, salary);
		employees.add(employee);
	}
	
	public void displayEmployeeData() {
		for (Employee employee : employees) {
			System.out.println(employee.toString());
		}
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}
	
	
}
