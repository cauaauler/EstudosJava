package exer01;

public class Conta {
	
	public double saldo;
	
	public void sacar(double valor) {
		if(valor > this.saldo) {
			System.out.println("O valor que deseja sacar � maior que seu saldo de R$ " + this.saldo);
		}else {
			this.saldo -= valor;
		}
	}
	public void transferencia(double valor, Conta conta) {
		if(valor <= this.saldo) {
			conta.saldo += valor;
			this.saldo -= valor;
		}else {
			System.out.println("Voc� n�o tem saldo suficiente na sua conta");
		}
	}

}
