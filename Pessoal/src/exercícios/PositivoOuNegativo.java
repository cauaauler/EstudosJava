package exerc�cios;

import java.util.Scanner;

public class PositivoOuNegativo {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int n = Integer.parseInt(leitor.nextLine());
		
		String classificacao = "";
		if(n>0) {
			classificacao = "positivo";
		}else if(n<0) {
			classificacao = "negativo";
		}else {
			classificacao = "zero";
		}
		System.out.println("O n�mero � "+classificacao);
	}

}
