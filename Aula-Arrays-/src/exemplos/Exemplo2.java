package exemplos;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		
		// Adaptar o programa par o usuário informar x numeros
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Digite quantos números deseja informar: ");
		int quantidade = Integer.parseInt(leitor.nextLine());
		
		int[] numeros = new int[quantidade];
		
		
		//numeros[0] = 10;
		//numeros[1] = 20;
		//numeros[2] = 1000;
		
		// Criar um for para ler os 3 números do teclado
		
		
		for(int d = 0; d < numeros.length; d ++) {
			System.out.print("Digite um número: ");
			numeros[d] = Integer.parseInt(leitor.nextLine());
			
		}
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		

	}

}
