package exemplos;

public class Pessoa {
	// atributos
	public String nome = "Desconhecido";
	public int idade = 1;
	
	// métodos (analogos às funções)
	// começam com letra minúscula
	// comumente sã descritos por verbos
	
	public void falarOla() {  // void é para não dar return
		System.out.println("Olá Mundo!");
	}
	
	public void imprimir() {
		System.out.println(this.nome + " tem " 
				+ this.idade + " anos."); //  trocar o p1 por this
	}
	
	// exemplo de método com argumento (frase)
	public void falar(String frase) {
		System.out.println(this.nome + " - " + frase);
		
	}
	
	public String obterIdade() {
		String r = "Idade: " + this.idade;
		return r;
	}
	
	public int obterIdadeNum() {
		return this.idade;
		
	}
	
	public void fazerAniversario() {
		this.idade++;
	}
}
