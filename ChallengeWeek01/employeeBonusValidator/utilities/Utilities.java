package utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilities {

	public static String readStringInput(Scanner input, String message) {
		System.out.println(message);
		String value = input.nextLine().trim();
		while (value.isEmpty() || value.matches(".*\\d.*")) {
			System.out.println("\033[31mValor inválido! \033[0m" + message);
			value = input.nextLine().trim();
		}
		return value;
	}

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
