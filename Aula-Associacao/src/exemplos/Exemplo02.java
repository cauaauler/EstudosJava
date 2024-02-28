package exemplos;

public class Exemplo02 {

	public static void main(String[] args) {

		Fabricante fab1 = new Fabricante();
		fab1.nome = "Samsung";
		fab1.pais = "Coreia do Sul";
		
		Celular cel1 = new Celular();
		cel1.modelo = "S20";
		cel1.usado = true;
		cel1.fabricante = fab1;
		cel1.imprimir();
		
		
	}

}
