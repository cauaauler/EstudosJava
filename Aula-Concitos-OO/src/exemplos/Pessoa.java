package exemplos;

public class Pessoa {

	public String nome = "Desconhecido";
	public int idade = 1;
	
	// métodos (análogos às funções)
	// métodos começam por letra minúscula e
	// quase sempre são descritos por verbos
	public void falarOla() {
		System.out.println("Olá Mundo!");
	}
	
	public void imprimir() {
		System.out.println(this.nome + " tem "
				+ this.idade + " anos.");
	}
	// exemplo de método com argumento (frase)
	public void falar(String frase) {
		System.out.println(this.nome + ": " + frase);
	}
			
	public String obterIdade() {
		String r = "Idade: " + this.idade;
		return r;
	}
	
	// método que retorne a idade no formato numérico
	public int obterIdadeNum() {
		return this.idade;
	}
	
	
	// criar um método chamado fazerAniversario onde 
	// a idade é incrementada em uma unidade
	
	public void fazerAniversario() {
		this.idade ++;
	}
	
	
}
