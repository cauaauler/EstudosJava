package ex2;

public class Fornecedor extends Pessoa{
	
	public int valorCredito;
	public int valorDivida;
	
	public int obterSaldo() {
		int saldo = this.valorCredito - this.valorDivida;
		return saldo;
	}

}
