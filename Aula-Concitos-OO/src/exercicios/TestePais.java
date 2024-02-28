package exercicios;

import java.util.Scanner;

public class TestePais {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Pais p1 = new Pais();
		
		System.out.println("Informe o nome: ");
		p1.nome = leitor.nextLine();
		
		System.out.println("Informe a capital: ");
		p1.capital = leitor.nextLine();
		
		System.out.println("Informe o número de Habitantes: ");
		p1.NumHabit = Integer.parseInt(leitor.nextLine());
		
		System.out.println(p1.nome);
		System.out.println(p1.capital);
		System.out.println(p1.NumHabit);
		
		
		
		
	}

}
