package employeeBonusValidator.model;

public class Employee {
	
	/*
	 * Esta classe representa um funcionário, contendo informações como nome,
	 * sobrenome e salário. Ela é responsável por armazenar e gerenciar os dados dos
	 * funcionários.
	 */

	private String firstName;
	private String lastName;
	private Salary salary;
	
	public Employee(String firstName, String lastName, Salary salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String greenText = "\033[0;32m"; 
		sb.append(greenText);		
        sb.append("----- Employee ----- " + "\n");
        sb.append("First Name: " + (this.firstName) + " Last Name: " + (this.lastName) + "\n");
        sb.append(salary.toString() + "\n");               
        return sb.toString();
	}
	
	
	
	

}
