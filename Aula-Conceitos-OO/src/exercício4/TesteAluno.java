package exerc�cio4;

import java.util.Scanner;

public class TesteAluno {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
			Aluno a = new Aluno();
			
			System.out.println("nome");
			a.nome = leitor.nextLine();
			System.out.println("curso");
			a.curso = leitor.nextLine();
			System.out.println("data de admiss�o");
			a.data_admissao = leitor.nextLine();
			System.out.println("n�mero da matr�cula");
			a.n_matricula = leitor.nextLine();
			a.imprimirTudo();
			
			Aluno a1 = new Aluno();
			
			System.out.println("nome");
			a1.nome = leitor.nextLine();
			System.out.println("curso");
			a1.curso = leitor.nextLine();
			System.out.println("data de admiss�o");
			a1.data_admissao = leitor.nextLine();
			System.out.println("n�mero da matr�cula");
			a1.n_matricula = leitor.nextLine();
			a1.imprimirTudo();
			
			Aluno a2 = new Aluno();
			
			System.out.println("nome");
			a2.nome = leitor.nextLine();
			System.out.println("curso");
			a2.curso = leitor.nextLine();
			System.out.println("data de admiss�o");
			a2.data_admissao = leitor.nextLine();
			System.out.println("n�mero da matr�cula");
			a2.n_matricula = leitor.nextLine();
			a2.imprimirTudo();
		
	}

}
