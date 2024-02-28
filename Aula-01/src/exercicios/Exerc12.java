package exercicios;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double n1;
		double n2;
		double n3;
		double n4;
		double n5;
		double n6;
		
		System.out.print("Primeiro Número: ");
		n1 = Double.parseDouble(leitor.nextLine());
	
		System.out.print("Segundo Número: ");
		n2 = Double.parseDouble(leitor.nextLine());
		
		System.out.print("Terceiro Número: ");
		n3 = Double.parseDouble(leitor.nextLine());
		
		System.out.print("Quarto Número: ");
		n4 = Double.parseDouble(leitor.nextLine());
		
		System.out.print("Quinto Número: ");
		n5 = Double.parseDouble(leitor.nextLine());
		
		System.out.print("Sexto Número: ");
		n6 = Double.parseDouble(leitor.nextLine());
		
		double media_123 = n1+n2+n3/3;
		double media_456 = n4+n5+n6/3;
		
		System.out.print("A média dos 3 primeiros números é: "+media_123);
		System.out.print("A média dos 3 últimos números é: "+media_456);
	}

}