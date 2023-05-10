package controller;

import java.util.ArrayList;

import model.Employee;
import model.Salary;

public class EmployeeController {

	/*
	 * Esta classe foi desenvolvida com a finalidade de armazenar, inicializar e
	 * exibir dados de um Employee, perante uma classe cliente que deseja acessá-
	 * (que neste caso, é o main). Sendo assim, este controller realiza uma
	 * intermediação entre o main e o model, garantindo uma melhor organização e
	 * separação de responsabilidades em um projeto.
	 */

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
