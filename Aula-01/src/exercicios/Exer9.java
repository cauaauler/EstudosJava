package exercicios;

import java.util.Scanner;

public class Exer9 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int n1;
		int n2;
		int n3;
		int n4;
		
		System.out.print("Primeiro n�mero: ");
		n1 = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Segundo n�mero: ");
		n2 = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Terceiro n�mero: ");
		n3 = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Quarto n�mero: ");
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
		System.out.print("m�dia: "+media);
	}

}