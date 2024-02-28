package exercício1;

import java.util.Scanner;

public class TestePais {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Pais p1 = new Pais();
		
		System.out.print("Nome do país: ");
		p1.nome = leitor.nextLine();
		
		System.out.print("Capital do país: ");
		p1.capital = leitor.nextLine();
		
		System.out.print("Quantidade de habitantes do país: ");
		p1.numHabitantes = Integer.parseInt(leitor.nextLine());
		
		System.out.println("Nome do país: " + p1.nome + "\n" + 
					"Capital do país: " + p1.capital + "\n" + 
						"Quantidade de habitantes do país: " + p1.numHabitantes);
	}

}
