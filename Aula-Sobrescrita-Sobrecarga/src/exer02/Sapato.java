package exer02;

public class Sapato extends Produto{
	private int tamanho;
	private boolean cadarco;
	
	public Sapato(String nome, double valor, int tamanho, boolean cadarco) {
		super(nome, valor);
		this.tamanho = tamanho;
		this.cadarco = cadarco;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Tamanho: "  + this.tamanho);
		System.out.println("Cadarço: " + this.cadarco);
	}
	
}
