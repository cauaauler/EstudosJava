package exercício4;

import java.util.Scanner;

public class TesteAluno {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
			Aluno a = new Aluno();
			
			System.out.println("nome");
			a.nome = leitor.nextLine();
			System.out.println("curso");
			a.curso = leitor.nextLine();
			System.out.println("data de admissão");
			a.data_admissao = leitor.nextLine();
			System.out.println("número da matrícula");
			a.n_matricula = leitor.nextLine();
			a.imprimirTudo();
			
			Aluno a1 = new Aluno();
			
			System.out.println("nome");
			a1.nome = leitor.nextLine();
			System.out.println("curso");
			a1.curso = leitor.nextLine();
			System.out.println("data de admissão");
			a1.data_admissao = leitor.nextLine();
			System.out.println("número da matrícula");
			a1.n_matricula = leitor.nextLine();
			a1.imprimirTudo();
			
			Aluno a2 = new Aluno();
			
			System.out.println("nome");
			a2.nome = leitor.nextLine();
			System.out.println("curso");
			a2.curso = leitor.nextLine();
			System.out.println("data de admissão");
			a2.data_admissao = leitor.nextLine();
			System.out.println("número da matrícula");
			a2.n_matricula = leitor.nextLine();
			a2.imprimirTudo();
		
	}

}
