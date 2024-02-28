package exer04;

public class Partida {
	
	public int placar1;
	public int placar2;
	public Cidade cidade;
	public String juiz;
	public Equipe equipe1;
	public Equipe equipe2;
	
	public void imprimir() {
		System.out.println();
		System.out.println(this.equipe1.nome + " " + this.placar1 + " X "  
						 + this.equipe2.nome + " " + this.placar2 + 
						 "\n    Juiz: " + this.juiz + 
						 "\n  Cidade: " + this.cidade.cidade);
	}

}
