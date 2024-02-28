package exercícios;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = Integer.parseInt(leitor.nextLine());
		
		int conta = 1;
		for(int i=1;i<=n;i++) {
			conta *= i;
			
		}
		System.out.print(conta);
	}

}
