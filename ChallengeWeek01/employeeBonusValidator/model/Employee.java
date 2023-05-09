package model;

public class Employee {
	
	String firstName;
	String lastName;
	Salary salary;
	
	public Employee(String firstName, String lastName, Salary salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}
	
	
	
	

}
