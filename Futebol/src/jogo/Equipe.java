package jogo;

import jogo.pessoas.Jogador;
import jogo.pessoas.Treinador;

public class Equipe {
	private String nome;
	private Treinador treinador;
	private Jogador goleiro;
	private Jogador fixo;
	private Jogador alaDireito;
	private Jogador alaEsquerdo;
	private Jogador pivo;
	
	
	public Equipe(String nome, Treinador treinador, Jogador goleiro, Jogador fixo, Jogador alaDireito,
			Jogador alaEsquerdo, Jogador pivo) {
		super();
		this.nome = nome;
		this.treinador = treinador;
		this.goleiro = goleiro;
		this.fixo = fixo;
		this.alaDireito = alaDireito;
		this.alaEsquerdo = alaEsquerdo;
		this.pivo = pivo;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Treinador getTreinador() {
		return treinador;
	}
	public void setTreinador(Treinador treinador) {
		this.treinador = treinador;
	}
	public Jogador getGoleiro() {
		return goleiro;
	}
	public void setGoleiro(Jogador goleiro) {
		this.goleiro = goleiro;
	}
	public Jogador getFixo() {
		return fixo;
	}
	public void setFixo(Jogador fixo) {
		this.fixo = fixo;
	}
	public Jogador getAlaDireito() {
		return alaDireito;
	}
	public void setAlaDireito(Jogador alaDireito) {
		this.alaDireito = alaDireito;
	}
	public Jogador getAlaEsquerdo() {
		return alaEsquerdo;
	}
	public void setAlaEsquerdo(Jogador alaEsquerdo) {
		this.alaEsquerdo = alaEsquerdo;
	}
	public Jogador getPivo() {
		return pivo;
	}
	public void setPivo(Jogador pivo) {
		this.pivo = pivo;
	}

}
