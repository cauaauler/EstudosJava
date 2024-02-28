package exemplos;

public class Pessoa {

	public String nome = "Desconhecido";
	public int idade = 1;
	
	// m�todos (an�logos �s fun��es)
	// m�todos come�am por letra min�scula e
	// quase sempre s�o descritos por verbos
	public void falarOla() {
		System.out.println("Ol� Mundo!");
	}
	
	public void imprimir() {
		System.out.println(this.nome + " tem "
				+ this.idade + " anos.");
	}
	// exemplo de m�todo com argumento (frase)
	public void falar(String frase) {
		System.out.println(this.nome + ": " + frase);
	}
			
	public String obterIdade() {
		String r = "Idade: " + this.idade;
		return r;
	}
	
	// m�todo que retorne a idade no formato num�rico
	public int obterIdadeNum() {
		return this.idade;
	}
	
	
	// criar um m�todo chamado fazerAniversario onde 
	// a idade � incrementada em uma unidade
	
	public void fazerAniversario() {
		this.idade ++;
	}
	
	
}
