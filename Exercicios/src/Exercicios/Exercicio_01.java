package Exercicios;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
	
	System.out.print("Informe um número: ");
	int n1 = Integer.parseInt(leitor.nextLine());
	
	System.out.print("Informe outro número: ");
	int n2 = Integer.parseInt(leitor.nextLine());
	
	int soma = n1 + n2;	
	int sub = n1 - n2;
	int mult = n1 * n2;
	int div = n1 / n2;
	int resto = n1 % n2;
	
	System.out.println("Soma: " + soma);
	System.out.println("Subtração: " + sub );
	System.out.println("Soma: " + mult);
	System.out.println("Soma: " + div);
	System.out.println("Soma: " + resto );
	
	}
	
	
	
	
	

}
