package exemplos;

import java.util.Scanner;

public class Exemplo01 {
	
	public static void main(String[] args) {
	
		//NumberFormatException
		Scanner leitor = new Scanner(System.in);
		
		try {
			System.out.println("Informe um número: ");
			int numero = Integer.parseInt(leitor.nextLine());
			System.out.printf("Número: %d%n", numero);
		}catch(Exception e) {
			System.out.println("Conversão inválida");
		}
		

		
		//ArrayIndexOutOfBoundsException
		try {
			int[] valores = new int[3];
			valores[3] = 3;
		}catch(Exception e){
			System.out.println("Índice invalido");
		}
		
		
		
		//ArithmeticException
		
		try {
			int x = 10;
			int y = 0;
			int w = x/y;
			
			System.out.printf("w = %d%n", w);
		} catch(Exception e) {
			System.out.println("Não é possível dividir por zero");
		}
		
		System.out.println("fim");
		
	}

}
