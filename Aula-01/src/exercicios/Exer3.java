package exercicios;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.print("Informe o primeiro número(inteiro): ");
		int n1 = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Informe o segundo número(inteiro): ");
		int n2 = Integer.parseInt(leitor.nextLine());
		
		
		
		
		
		if(n1 == n2) {
			System.out.println("Os números digitados foram: "+n1+" e "+n2);
		}
		else if(n1 > n2) {
			System.out.println("O maior número é: " + n1);
		}
		else {
			System.out.println("O maior número é: " + n2);
		}

	}

}