package jogo;

import jogo.misc.Bola;
import jogo.misc.Quadra;
import jogo.pessoas.Jogador;
import jogo.pessoas.Juiz;
import jogo.pessoas.Treinador;

public class Exemplo02 {

	public static void main(String[] args) {

		Treinador t1 = new Treinador();
		t1.setNome("Renato");
		
		Jogador j11 = new Jogador();
		j11.setNome("Marcelo");
		
		Jogador j12 = new Jogador();
		j11.setNome("Adilson");
		
		Jogador j13 = new Jogador();
		j13.setNome("Arce");
		
		Jogador j14 = new Jogador();
		j14.setNome("Roger");
		
		Jogador j15 = new Jogador();
		j15.setNome("Renato");
		
		Equipe mandante = new Equipe();
		mandante.setNome("Grêmio");
		mandante.setTreinador(t1);
		mandante.setGoleiro(j11);
		mandante.setFixo(j12);
		mandante.setAlaDireito(j13);
		mandante.setAlaEsquerdo(j14);
		mandante.setPivo(j15);
		
		
		Treinador t2 = new Treinador();
		t2.setNome("Mano");
		
		Jogador j21 = new Jogador();
		j21.setNome("Clemer");
		
		Jogador j22 = new Jogador();
		j22.setNome("Gamarra");
		
		Jogador j23 = new Jogador();
		j23.setNome("Dalessandro");
		
		Jogador j24 = new Jogador();
		j24.setNome("Renteria");
		
		Jogador j25 = new Jogador();
		j25.setNome("Falcão");
		
		Equipe visitante = new Equipe();
		visitante.setNome("Inter");
		visitante.setTreinador(t2);
		visitante.setGoleiro(j21);
		visitante.setFixo(j22);
		visitante.setAlaDireito(j23);
		visitante.setAlaEsquerdo(j24);
		visitante.setPivo(j25);
		
		Bola b = new Bola();
		b.setMarca("Adidas");
		
		Quadra q = new Quadra();
		q.setComprimento(40);
		q.setLargura(20);
		
		Juiz j = new Juiz();
		j.setNome("Arnaldo");
		
		Futebol f = new Futebol();
		f.setBola(b);
		f.setQuadra(q);
		f.setJuiz(j);
		f.setMandante(mandante);
		f.setVisitante(visitante);
		
		// Daqui em diante, usaremos apenas o objeto f
		
		System.out.println(f.getMandante().getTreinador().getNome());
		System.out.println(f.getQuadra().getLargura());
		System.out.println(f.getVisitante().getGoleiro().getNome());
	}

}
