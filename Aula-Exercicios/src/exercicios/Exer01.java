package exercicios;

import java.util.Scanner;

public class Exer01 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		for (int i = 0; i < 1; i++) {
			
			System.out.print("Nome de usu�rio: ");
			String nome = leitor.nextLine();
			
			System.out.print("Senha de usu�rio: ");
			String senha = leitor.nextLine();
			
			if(nome.equals(senha)) {
				System.out.println("Nome e senha n�o podem ser iguais!");
				i--;
			}
			
		}
	}

}
