package sobrescrita;

public class Teste {
	public static void main(String[] args) {
		
		Caderno caderno1 = new Caderno(123, 100, false);
		caderno1.imprimir();
		
		Caneta caneta1 = new Caneta(122, "Azul", "Caloi");
		caneta1.imprimir();
	}
}
