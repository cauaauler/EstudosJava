package exer2_OO;

public class Sorteio {

	public int n;
	public int palpite;
	
	public void ehIgual() {
		if(n == palpite) {
			System.out.println("� igual");
		}else if(palpite < n) {
			System.out.println("est� abaixo");
		}else {
			System.out.println("est� acima");
		}
	}
	
}
