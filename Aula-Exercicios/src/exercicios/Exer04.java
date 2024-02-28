package exercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Exer04 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Nome do atleta: ");
		String nome = leitor.nextLine();
		
		double[] distancias = new double[5]; 
		for (int i = 0; i < 5; i++) {
			
			System.out.print((i+1)+"º salto: ");
			distancias[i] = Double.parseDouble(leitor.nextLine());
			
		}
		
		double soma = 0;
		for (int i = 0; i < distancias.length; i++) {
			soma += distancias[i];
			
		}
		double media = soma/distancias.length;
		
		System.out.println("RESULTADO FINAL");
		System.out.println("Atleta: " + nome);
		System.out.print("Saltos: ");
		for (int i = 0; i < distancias.length; i++) {
			
			System.out.print(distancias[i] + " ");
		}
		System.out.println();
		System.out.println("Média dos saltos: " + media);
		
	}

}
