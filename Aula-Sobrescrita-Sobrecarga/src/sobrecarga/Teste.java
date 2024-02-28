package sobrecarga;

public class Teste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.falar();
		p1.falar("salve!");
		p1.falar("falae", 23);
		
		p1.somar(1, 2);
		p1.somar(1.6, 2); 
	}

}
