package exercícios;

import java.util.Scanner;

public class Exer2 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double[] numeros = new double[5];
		
		double soma = 0;
		for(int i = 0; i<5;i++) {
			System.out.print((i+1)+"º número: ");
			numeros[i] = Double.parseDouble(leitor.nextLine());
			soma += numeros[i];
		}
		System.out.println("Soma: "+soma);
		}
		

}
