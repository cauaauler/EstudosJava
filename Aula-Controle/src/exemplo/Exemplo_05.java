package exemplo;

import java.util.Scanner;

public class Exemplo_05 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int numero = Integer.parseInt(leitor.nextLine());
		
		switch(numero) {
		
		case 0: {
			System.out.println("ZERO!");
			//break;
		}
		
		
		case 1: {
			System.out.println("UM!");
			//break;
		}
		
		case 2: {
			System.out.println("DOIS!");
			//break;
		}
		
		default: {
			System.out.println("OUTRO NÚMERO!");
		}
		}
		
		
		
		
	}

}
