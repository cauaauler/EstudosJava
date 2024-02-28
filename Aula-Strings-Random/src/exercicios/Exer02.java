package exercicios;

import java.util.Scanner;

public class Exer02 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
			System.out.println("POR FAVOR, OBEDEÇA O TAMANHO DE 10 LETRAS");
			
			System.out.print("Digite uma palavra de 10 letras: ");
			String n1 = leitor.nextLine();
			
			System.out.print("Digite outra palavra de 10 letras: ");
			String n2 = leitor.nextLine();
			
			int similaridade = 0;
			
			for (int i = 0; i < n1.length(); i++) {
				if(n1.charAt(i) == n2.charAt(i)) {
					similaridade ++;
				}
				
			}
			System.out.println("As duas string tem "+(similaridade*10)+"% de similaridade");
	}

}
