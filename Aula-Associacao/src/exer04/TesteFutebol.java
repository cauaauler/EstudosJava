package exer04;

import java.util.Random;

public class TesteFutebol {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		Cidade c1 = new Cidade();
		
		c1.estado = "rs";
		c1.pais = "brasil";
		c1.cidade = "feliz";
		
		Equipe equipe1 = new Equipe();
		
		equipe1.nome = "cauazes";
		equipe1.cidade = c1;
		equipe1.vitorias = 20;
		equipe1.empates = 0;
		equipe1.derrotas = 0;
		
		Cidade c2 = new Cidade();

		c2.estado = "sp";
		c2.pais = "usa";
		c2.cidade = "sao paulo";

		Equipe equipe2 = new Equipe();

		equipe2.nome = "fracos";
		equipe2.cidade = c2;
		equipe2.vitorias = 5;
		equipe2.empates = 13;
		equipe2.derrotas = 2;
		
		Partida p1 = new Partida();
		
		p1.cidade = c2;
		p1.equipe1 = equipe1;
		p1.equipe2 = equipe2;
		p1.juiz = "cleber";
		p1.placar1 = r.nextInt(5);
		p1.placar2 = r.nextInt(5);
		
		equipe1.imprimir();
		System.out.println("       X");
		equipe2.imprimir();
		
		p1.imprimir();
	}

}
