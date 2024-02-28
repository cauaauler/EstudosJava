package exemplos;

public class Pessoa {
	// atributos
	public String nome = "Desconhecido";
	public int idade = 1;
	
	// m�todos (analogos �s fun��es)
	// come�am com letra min�scula
	// comumente s� descritos por verbos
	
	public void falarOla() {  // void � para n�o dar return
		System.out.println("Ol� Mundo!");
	}
	
	public void imprimir() {
		System.out.println(this.nome + " tem " 
				+ this.idade + " anos."); //  trocar o p1 por this
	}
	
	// exemplo de m�todo com argumento (frase)
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
