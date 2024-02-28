package exemplo02;

public class TesteCelular {
	
	public static void main(String[] args) {
		
		Fabricante f1 = new Fabricante();
		f1.nome = "motorola";
		f1.pais = "bali";

		Celular c1 = new Celular();
		c1.modelo = "moto g6";
		c1.usado = true;
		c1.fabricante = f1;

		c1.imprimir();

	}

}
