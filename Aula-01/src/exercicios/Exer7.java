package exercicios;

import java.util.Scanner;

public class Exer7 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double novoSalario = 0;
		
		System.out.print("Seu salário: ");
		double salario = Double.parseDouble(leitor.nextLine());
		
		if (salario <= 1000) {
			novoSalario = salario + salario*20/100;
		}
		if ((salario > 1000) && (salario <= 2000)) {
			novoSalario = salario + salario*15/100;
		}
		if (salario > 2000) {
			novoSalario = salario + salario*10/100;	
		}
		System.out.println("Seu salário com aumento é de R$"+novoSalario);

	}

}