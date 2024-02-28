package exer03;

import java.util.Scanner;

public class TesteFilme {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Cidade cidade1 = new Cidade();
		System.out.print("Nome da cidade: ");
		cidade1.nome = leitor.nextLine();
		System.out.print("Estado: ");
		cidade1.estado = leitor.nextLine();
		System.out.print("País: ");
		cidade1.pais = leitor.nextLine();
		System.out.print("Quantidade de habitantes: ");
		cidade1.habitantes = Integer.parseInt(leitor.nextLine());
		
		Diretor diretor1 = new Diretor();
		System.out.print("Nome: ");
		diretor1.nome = leitor.nextLine();
		System.out.print("Quantidade de prêmios: ");
		diretor1.premios = Integer.parseInt(leitor.nextLine());
		
		Filme filme1 = new Filme();
		filme1.cidade = cidade1;
		filme1.diretor = diretor1;
		
		filme1.imprimir();
	}

}
