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
		j11.setNome("Parede");
		Jogador j12 = new Jogador();
		j12.setNome("Porta");
		Jogador j13 = new Jogador();
		j13.setNome("Romaldo");
		Jogador j14 = new Jogador();
		j14.setNome("Nilson");
		Jogador j15 = new Jogador();
		j15.setNome("Maom�");
		
		Equipe mandante = new Equipe();
		mandante.setTreinador(t1);
		mandante.setNome("Napoli");
		mandante.setGoleiro(j11);
		mandante.setAlaDireito(j12);
		mandante.setAlaEsquerdo(j13);
		mandante.setFixo(j14);
		mandante.setPivo(j15);
		
		Treinador t2 = new Treinador();
		t2.setNome("golias");
		
		Jogador j21 = new Jogador();
		j21.setNome("lampada");
		Jogador j22 = new Jogador();
		j22.setNome("sovaco");
		Jogador j23 = new Jogador();
		j23.setNome("deide");
		Jogador j24 = new Jogador();
		j24.setNome("costa");
		Jogador j25 = new Jogador();
		j25.setNome("gordo");
		
		Equipe visitante = new Equipe();
		visitante.setNome("Milan");
		visitante.setTreinador(t2);
		visitante.setGoleiro(j21);
		visitante.setAlaDireito(j22);
		visitante.setAlaEsquerdo(j23);
		visitante.setFixo(j24);
		visitante.setPivo(j25);
		
		Bola b = new Bola();
		b.setMarca("Acer");
		
		Quadra q = new Quadra();
		q.setComprimento(40);
		q.setLargura(20);
		
		Juiz j = new Juiz();
		j.setNome("Julio C�sar");
		
		Futebol f = new Futebol();
		f.setBola(b);
		f.setQuadra(q);
		f.setJuiz(j);
		f.setMandante(mandante);
		f.setVisitante(visitante);
	
		System.out.println(f.getMandante().getTreinador().getNome());
		System.out.println(f.getQuadra().getLargura());
		System.out.println(f.getVisitante().getGoleiro().getNome());
	}

}
