package exemplos;

import java.util.Scanner;

public class Exemplo01 {
	
	public static void main(String[] args) {
	
		//NumberFormatException
		Scanner leitor = new Scanner(System.in);
		
		try {
			System.out.println("Informe um n�mero: ");
			int numero = Integer.parseInt(leitor.nextLine());
			System.out.printf("N�mero: %d%n", numero);
		}catch(Exception e) {
			System.out.println("Convers�o inv�lida");
		}
		

		
		//ArrayIndexOutOfBoundsException
		try {
			int[] valores = new int[3];
			valores[3] = 3;
		}catch(Exception e){
			System.out.println("�ndice invalido");
		}
		
		
		
		//ArithmeticException
		
		try {
			int x = 10;
			int y = 0;
			int w = x/y;
			
			System.out.printf("w = %d%n", w);
		} catch(Exception e) {
			System.out.println("N�o � poss�vel dividir por zero");
		}
		
		System.out.println("fim");
		
	}

}
