package ex2;

public class Operario extends Empregado{
	public double valorProducao;
	
	public double calcularSalarioEmpregado() {
		double salarioEmpregado = (salarioBase + valorProducao) - (salarioBase + valorProducao)*imposto/100;
		return salarioEmpregado;
	}
}
