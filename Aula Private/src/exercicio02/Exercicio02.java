package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		Correntista correntista = new Correntista(); 
		correntista.setNome(leitor.nextLine());
		correntista.setSaldo(Integer.parseInt(leitor.nextLine()));
	}

}
