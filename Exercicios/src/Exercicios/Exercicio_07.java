package Exercicios;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o sal�rio: R$");
		double salario = Double.parseDouble(leitor.nextLine());
		
		double novoSalario = 0;
		
		
		if (salario <= 1000) {
			double aumento = salario * 0.2;
			novoSalario = salario + aumento;	
		}
		
		
		if ((salario > 1000)&&(salario <= 2000)) {
			double aumento = salario * 0.15;
			novoSalario = salario + aumento;
		}
		
		if (salario > 2000) {
			double aumento = salario * 0.10;
			novoSalario = salario + aumento;
		}
		
		System.out.println("O seu sal�rio com aumento �: R$" + novoSalario);
	}
	
}
