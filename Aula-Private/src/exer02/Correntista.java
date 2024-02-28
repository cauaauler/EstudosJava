package exer02;

public class Correntista {
	
	private String nome;
	private double saldo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void debito(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
		}
	}
	public void credito(double valor) {
		this.saldo -= valor;
	}

}
