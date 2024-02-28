package exercicios;

import java.util.Scanner;

public class Exer05 {
	public static void main(String[] args) {
		 Scanner leitor = new Scanner(System.in);
		 
		 System.out.print("Número: ");
		 int n = Integer.parseInt(leitor.nextLine());
		 
		 String[] nomes = new String[n];
		 
		 double soma = 0;
		 for (int i = 0; i < nomes.length; i++) {
			 
			 System.out.print((i+1)+"º nome: ");
			 nomes[i] = leitor.nextLine();
			 
			 for (int j = 0; j < nomes[i].length(); j++) {
				 soma++;
			}
			 
		}
		 String maior = nomes[0];
		 String menor = nomes[0];
		 for (int j = 0; j < nomes.length; j++) {
			 if(nomes[j].length() >= maior.length()) {
				 maior = nomes[j];
			 }
			 else{
				 menor = nomes[j];
			}
			
		}
		 System.out.println("Maior palavra: " + maior);
		 System.out.println("Menor palavra: " + menor);
		 System.out.println("Média de letras: " + soma/nomes.length);
		 System.out.println("Soma de letras: " + soma);
		
		
	}

}
