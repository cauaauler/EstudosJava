package exercicio03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

	Scanner leitor = new Scanner(System.in);
		
	Diretor diretor = new Diretor();
	
	System.out.println("Digite o nome do diretor:");
	diretor.nome = leitor.nextLine();
	
	System.out.println("Digite o sobrenome do diretor:");
	diretor.sobrenome = leitor.nextLine();
	
	System.out.println("Digite quantos prêmios tem:");
	diretor.premios = Integer.parseInt(leitor.nextLine());
	
	Cidade cidade = new Cidade();
	
	System.out.println("Digite o nome da cidade:");
	cidade.nome = leitor.nextLine();
	
	System.out.println("Digite o nome do país em que a cidade se localiza:");
	cidade.pais = leitor.nextLine();
	
	System.out.println("Digite o nome do estado em que a cidade se localiza:");
	cidade.estado = leitor.nextLine();
	
	System.out.println("Digite o número de habitantes da cidade:");
	cidade.numHab = Integer.parseInt(leitor.nextLine());
	
	Filme filme = new Filme();
	filme.diretor = diretor;
	filme.cidade = cidade;
	filme.imprimir();
	
	
	}

}
