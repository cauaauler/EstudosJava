package exer1_OO;

public class TestePrimos {
	
	public static void main(String[] args) {
		
		Primos p = new Primos();
		
		p.n = 11;
		if(p.testarPrimo()){
			System.out.println("primo");
		}
			
	}

}
