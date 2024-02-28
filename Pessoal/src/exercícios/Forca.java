package exercícios;

import java.util.Random;
import java.util.Scanner;

public class Forca {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Random gerador = new Random();
		
		String palavras[] = {"cavalo","banana","hornets","mavericks"};
		
		int vida = 6;
		int a = gerador.nextInt(palavras.length);
		
		String escolhida = palavras[a];
		String revelado[] = new String[escolhida.length()];
		String letra = "";
		
		System.out.println(escolhida);
		for (int i = 0; i < vida; i++) {
			System.out.println((i+1)+"ª letra: ");
			letra = leitor.nextLine();
				if(letra.length() > 1) {
					System.out.println("Você só pode escrever uma letra por vez!");
					i--;
					break;
				}
			for (int j = 0; j < escolhida.length(); j++) {
				if(escolhida.contains(letra)) {
					System.out.println(letra);
				}
			}
		}
	}

}
