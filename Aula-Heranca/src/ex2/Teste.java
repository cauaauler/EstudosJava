package ex2;

public class Teste {
	public static void main(String[] args) {
		
		Fornecedor f1 = new Fornecedor();
		f1.valorCredito = 10000;
		f1.valorDivida = 200;
		
		Empregado e1 = new Empregado();
		e1.codigoSetor = 3;
		e1.salarioBase = 200;
		e1.imposto = 10;
		
		Administrador a1 = new Administrador();
		a1.salarioBase = 200;
		a1.imposto = 10;
		a1.ajudaDeCustos = 200;
		
		Operario o1 = new Operario();
		o1.salarioBase = 200;
		o1.imposto = 10;
		o1.valorProducao = 100;
		
		Vendedor v1 = new Vendedor();
		v1.salarioBase = 200;
		v1.imposto = 10;
		v1.valorVendas = 100;
		v1.comissao = 10;
		
		System.out.println(f1.obterSaldo());
		System.out.println(e1.calcularSalario());
		System.out.println(a1.calcularSalarioAdmin());
		System.out.println(o1.calcularSalarioEmpregado());
		System.out.println(v1.calcularSalarioVendedor());
		
	}
}
