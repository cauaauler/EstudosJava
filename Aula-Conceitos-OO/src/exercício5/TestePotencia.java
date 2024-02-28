package exercício5;

public class TestePotencia {
	
	public static void main(String[] args) {
		
		Potencia c = new Potencia();
		
		c.z = c.a = 2;
		c.x = 3;
		
		System.out.println(c.elevadoA());
	}

}
