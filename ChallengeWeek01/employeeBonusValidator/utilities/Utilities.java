package utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilities {

	/*
	 * Esta classe foi desenvolvida com a finalidade de fornecer métodos utilitários
	 * para tratar erros. Dessa forma, é possível reduzir a replicação de código no
	 * main e, consequentemente, aumentar a reutilização de recursos similares em
	 * outros pontos do código.
	 */

	//Verifica se uma entrada é válida (não está vazia ou não contém números) 
	public static String readStringInput(Scanner input, String message) {
		System.out.println(message);
		String value = input.nextLine().trim();
		while (value.isEmpty() || value.matches(".*\\d.*")) {
			System.out.println("\033[31mValor inválido! \033[0m" + message);
			value = input.nextLine().trim();
		}
		return value;
	}

	//Verifica se entrada de float é um valor numérico válido
	public static float readFloatInput(Scanner input, String message) {
		System.out.println(message);
		float value = 0;
		boolean isValid = false;
		while (!isValid) {
			try {
				value = input.nextFloat();
				isValid = true;
			} catch (InputMismatchException e) {
				System.out.println("\033[31mValor inválido! \033[0m" + message);
				input.nextLine();
			}
		}
		input.nextLine();
		return value;
	}

}
