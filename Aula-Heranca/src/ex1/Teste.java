package ex1;

public class Teste {

	public static void main(String[] args) {
		Fazenda f1 = new Fazenda();
		f1.localidade = "Feliz";
		f1.tamanho = "500m²";
		f1.valor = 2000000;
		f1.qtdAnimais = 600;
		
		Casa c1 = new Casa();
		c1.localidade = "São Carlos";
		c1.tamanho = "60m²";
		c1.valor = 300000;
		c1.moradores = 3;
		
		f1.Imprimir();
		c1.Imprimir();
		
	}
	
	
}
