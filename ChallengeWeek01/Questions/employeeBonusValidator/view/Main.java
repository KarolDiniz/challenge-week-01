package employeeBonusValidator.view;

import java.util.Scanner;

import employeeBonusValidator.controller.EmployeeController;
import utilities.Utilities;

public class Main {

	/*
	 * Essa classe é responsável pela execução do programa, realizando assim, a
	 * interação com o usurário via console.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		EmployeeController employeeController = new EmployeeController();

		System.out.println("\u001B[36m ---- EMPLOYEE BONUS VALIDATE ---- \033[0m");
		System.out.println("          Seja bem-vindo!       \n");
		int qtdEmployee = (int) Utilities.readFloatInput(input,"Insira a quantidade de funcionários que você irá cadastrar:");

		for (int i = 0; i < qtdEmployee; i++) {
			String firstName = Utilities.readStringInput(input,"Insira o primeiro nome do " + (i + 1) + "° funcionário:");
			String lastName = Utilities.readStringInput(input, "Insira o sobrenome do " + (i + 1) + "° funcionário:");
			float valueSalary = Utilities.readFloatInput(input, "Cadastre o salário do " + (i + 1) + "° funcionário:");
			System.out.println("------------------------------------");
			employeeController.registerEmployee(firstName, lastName, valueSalary);
		}
		employeeController.displayEmployeeData();
	}
}
