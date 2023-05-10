package model;

public class Salary {

	/*
	 * Esta classe é responsável por armazenar e gerenciar todas as informações
	 * relacionadas ao salário de um funcionário. Ela contém toda a lógica e
	 * cálculos necessários para determinar o valor do bônus ou desconto e o valor
	 * do salário líquido final.
	 */

	StringBuilder sb = new StringBuilder();
	private float valueSalary;
	private float valueBonusOrDesconto;
	private float netSalary;

	public Salary(float valueSalary) {
		this.valueSalary = valueSalary;
		this.validateBonus();
	}

	@Override
	public String toString() {
		String greenText = "\033[0;32m";
		sb.append(greenText);
		sb.append("Salary: " + valueSalary + "\n");
		sb.append(this.verifyDescontoOrBonus());
		sb.append("Net Salary: " + netSalary + "\n");
		return sb.toString();
	}

	//Retorna o bonus e o salário liquido a partir do salário.
	public void validateBonus() {
		if (valueSalary <= 1000) {
			valueBonusOrDesconto = (float) (valueSalary * 0.2);
			netSalary = valueSalary + valueBonusOrDesconto;

		} else if (valueSalary > 1000 && valueSalary <= 2000) {
			valueBonusOrDesconto = (float) (valueSalary * 0.1);
			netSalary = valueSalary - valueBonusOrDesconto;
		} else {
			valueBonusOrDesconto = (float) (valueSalary * 0.1);
			netSalary = valueSalary - valueBonusOrDesconto;
		}
	}

	
	//Retorna para o toString se há ou não um desconto no salário.	 
	public String verifyDescontoOrBonus() {
		if (valueSalary > 2000) {
			return "Desconto: " + valueBonusOrDesconto + "\n";
		} else {
			return "Bonus: " + valueBonusOrDesconto + "\n";
		}
	}
}
