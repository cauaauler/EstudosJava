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
		
		System.out.print("Primeiro N�mero: ");
		n1 = Double.parseDouble(leitor.nextLine());
	
		System.out.print("Segundo N�mero: ");
		n2 = Double.parseDouble(leitor.nextLine());
		
		System.out.print("Terceiro N�mero: ");
		n3 = Double.parseDouble(leitor.nextLine());
		
		System.out.print("Quarto N�mero: ");
		n4 = Double.parseDouble(leitor.nextLine());
		
		System.out.print("Quinto N�mero: ");
		n5 = Double.parseDouble(leitor.nextLine());
		
		System.out.print("Sexto N�mero: ");
		n6 = Double.parseDouble(leitor.nextLine());
		
		double media_123 = n1+n2+n3/3;
		double media_456 = n4+n5+n6/3;
		
		System.out.print("A m�dia dos 3 primeiros n�meros �: "+media_123);
		System.out.print("A m�dia dos 3 �ltimos n�meros �: "+media_456);
	}

}