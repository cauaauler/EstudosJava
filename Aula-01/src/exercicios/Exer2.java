package exercicios;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.print("Informe um n�mero(inteiro): ");
		int n1 = Integer.parseInt(leitor.nextLine());
		
		int resto = n1 % 2;
		
		if (resto == 0) {
			System.out.println("O n�mero " + n1 + " � par.");
		}
		else {
			System.out.println("O n�mero " + n1 + " � �mpar.");
		}
			
}
}