package exercicios;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.print("Informe o primeiro n�mero(inteiro): ");
		int n1 = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Informe o segundo n�mero(inteiro): ");
		int n2 = Integer.parseInt(leitor.nextLine());
		
		
		
		
		
		if(n1 == n2) {
			System.out.println("Os n�meros digitados foram: "+n1+" e "+n2);
		}
		else if(n1 > n2) {
			System.out.println("O maior n�mero �: " + n1);
		}
		else {
			System.out.println("O maior n�mero �: " + n2);
		}

	}

}