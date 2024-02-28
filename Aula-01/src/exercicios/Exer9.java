package exercicios;

import java.util.Scanner;

public class Exer9 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int n1;
		int n2;
		int n3;
		int n4;
		
		System.out.print("Primeiro número: ");
		n1 = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Segundo número: ");
		n2 = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Terceiro número: ");
		n3 = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Quarto número: ");
		n4 = Integer.parseInt(leitor.nextLine());
		
		float media = (n1+n2+n3+n4)/4;
		
		int maior;
		
		if (n1 > n2 && n1 > n3 && n1 > n4) {
			 maior = n1;
		}
		else if (n2 > n1 && n2 > n3 && n2 > n4) {
			 maior = n2;
		}
		else if (n3 > n1 && n3 > n2 && n3 > n4) {
			 maior = n3;
		}
		else {
			maior = n4;
		}
		
		int menor;
		
		if (n1 < n2 && n1 < n3 && n1 < n4) {
			 menor = n1;
		}
		else if (n2 < n1 && n2 < n3 && n2 < n4) {
			 menor = n2;
		}
		else if (n3 < n1 && n3 < n2 && n3 < n4) {
			 menor = n3;
		}
		else {
			menor = n4;
		}
		System.out.print("maior: "+maior);
		System.out.print("menor: "+menor);
		System.out.print("média: "+media);
	}

}