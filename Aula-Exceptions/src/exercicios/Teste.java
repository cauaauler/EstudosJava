package exercicios;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		boolean x = true;
		
		while(x) {
		try {
			Matematica c = new Matematica();
			
			System.out.println("Dividendo: ");
			int a = Integer.parseInt(leitor.nextLine());
			
			System.out.println("Divisor: ");
			int b = Integer.parseInt(leitor.nextLine());
			
			System.out.println(c.dividir(a,b));
			
			x = false;
		} catch (ArithmeticException e) {
			System.out.println("Não é possível dividir por zero");
		} catch(NumberFormatException e) {
			System.out.println("Algarismo impróprio");
		}
		
	}
	}

}
