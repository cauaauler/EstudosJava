package exercício2;

public class TestaCalculadora {
	
	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		
		c.n1 = 2;
		c.n2 = 1;
		
		
		System.out.println(c.soma());
		System.out.println(c.subtracao());
		System.out.println(c.multiplicacao());
		System.out.println(c.divisao());
		System.out.println(c.media());
	}

}
