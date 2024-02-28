package exer04;

public class Equipe {
	
	public String nome;
	public Cidade cidade;
	public int vitorias;
	public int empates;
	public int derrotas;
	
	
	public int contarPontuacao() {
		return this.vitorias*3 + this.empates;
		
	}
	public void imprimir() {
		System.out.println("Equipe: " + this.nome + 
							"\nCidade: " + this.cidade.cidade +
							"\nPontuação no campeonato: " + this.contarPontuacao());
		
	}

}
