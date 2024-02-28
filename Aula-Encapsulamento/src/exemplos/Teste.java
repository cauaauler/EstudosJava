package exemplos;

public class Teste {
	public static void main(String[] args) {
		
		Caderno caderno1 = new Caderno("Caderno", 10.0, 100, true);
		Caneta caneta1 = new Caneta("Caneta", 1, "Azul", "Bic");
		
		
		caderno1.imprimir();
		caneta1.imprimir();
	}

}
  