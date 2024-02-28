package exemplos;

public class Exemplo {
	
	public static void main(String[] args) {
		
		// construção de um objeto da classe computador
		Computador c1 = new Computador();
		
		c1.marca = "Dell";
		c1.modelo = "Pacillion";
		c1.processador = "Pentium 100";
		c1.resolucao = "640x480";
		
		// construir um novo objeto
		Computador c2 = new Computador();
		
		c2.marca = "Acer";
		c2.modelo = "Aspire 5";
		c2.processador = "i5";
		c2.resolucao = "1920x1080";
		
		// imprimir os valores de c1 e c2
		
		System.out.println(c1.marca);
		System.out.println(c1.modelo);
		System.out.println(c1.processador);
		System.out.println(c1.resolucao);
		
		System.out.println();
		
		System.out.println(c2.marca);
		System.out.println(c2.modelo);
		System.out.println(c2.processador);
		System.out.println(c2.resolucao);
		
		
		
		
	}

}
