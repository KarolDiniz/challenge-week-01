package run;

import java.util.Scanner;

import controller.EmployeeController;

public class Main {
	
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		Scanner inputEmployee = new Scanner(System.in);
		EmployeeController employeeController = new EmployeeController();
		
		System.out.println(" ---- EMPLOYEE BONUS VALIDATE ----");
		System.out.println("          Seja bem-vindo!       \n");
		System.out.println("Insira a quantidade de funcionários que você irá cadastrar:");
		int qtdEmployee = input.nextInt();
		
		for (int i=0; i < qtdEmployee; i++) {		
			System.out.println("Insira o primeiro nome do " + (i+1) + "° funcionário:");
			String firstName = inputEmployee.nextLine();
			
			System.out.println("Insira o sobrenome do " + (i+1) + "° funcionário:");
			String lastName = inputEmployee.nextLine();
			
			System.out.println("Cadastre o salário do " + (i+1) + "° funcionário:");
			float valueSalary = input.nextFloat();
			
			System.out.println("------------------------------------");
			
			employeeController.registerEmployee(firstName, lastName, valueSalary);	
			
		}
		
		employeeController.displayEmployeeData();

	}

}
