package ex2;

public class Administrador extends Empregado{
	public double ajudaDeCustos;
	
	public double calcularSalarioAdmin() {
		double salarioAdm = (salarioBase + ajudaDeCustos) - (salarioBase + ajudaDeCustos) * imposto/100;
		return salarioAdm;
	}
}
