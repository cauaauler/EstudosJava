package exer02;

public class Teste {
	public static void main(String[] args) {
		
		Sapato s1 = new Sapato("Sapato", 20.0, 42, false);
		Camiseta c1 = new Camiseta("Camiseta", 15.0, "Azul", "G");
		
		Comprador comprador1 = new Comprador();
		
		comprador1.consulta(s1);
		comprador1.consulta(c1);
	}

}
