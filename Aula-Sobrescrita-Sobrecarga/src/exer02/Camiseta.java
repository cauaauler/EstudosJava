package exer02;

public class Camiseta extends Produto{
	private String cor;
	private String tamanho;
	
	public Camiseta(String nome, double valor, String cor, String tamanho) {
		super(nome, valor);
		this.cor = cor;
		this.tamanho = tamanho;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Cor: " + this.cor);	
		System.out.println("Tamanho: " + this.tamanho);
	}

}
