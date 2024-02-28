package exer2_OO;

public class Sorteio {

	public int n;
	public int palpite;
	
	public void ehIgual() {
		if(n == palpite) {
			System.out.println("é igual");
		}else if(palpite < n) {
			System.out.println("está abaixo");
		}else {
			System.out.println("está acima");
		}
	}
	
}
