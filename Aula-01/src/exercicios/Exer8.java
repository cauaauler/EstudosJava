package exercicios;

import java.util.Scanner;

public class Exer8 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double novo_salario = 0;
		
		System.out.print("Seu sal�rio: ");
		double salario = Double.parseDouble(leitor.nextLine());
		
		if (salario <= 1000) {
			novo_salario = salario + salario*20/100;
		}
		else if (salario > 1000 && salario <= 2000) {
			novo_salario = salario + salario*15/100;
		}
		else  {
			novo_salario = salario + salario*10/100;	
		}
		System.out.println("Seu sal�rio com aumento � de R$"+novo_salario);


	}

}