package exercícios;

import java.util.Scanner;

public class ConversorTemperaturas {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Temperatura em graus Celscius: ");
		int c = Integer.parseInt(leitor.nextLine());
		
		double f = c * 1.8 + 32;
		double k = c + 273.15;
		double re = c * 0.8;
		double ra = c * 1.8 + 32 + 459.67;
		
		System.out.println("Temperatura em Fahrenheit: "+f);
		System.out.println("Temperatura em Kelvin: "+k);
		System.out.println("Temperatura em Réaumur: "+re);
		System.out.println("Temperatura em Rankine: "+ra);
	}
}
