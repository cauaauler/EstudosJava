package exer3_OO;

public class Permutacao {
	
	public String n1;
	public String n2;
	public String maior;
	public String menor;
	
	public int x;
	
	
	public void ehMaior() {
		if(n1.length() >= n2.length()) {
			maior = n1;
			menor = n2;
		}else {
			maior = n2;
			menor = n1;
		}
	}
	
	public void ehPermutacao() {
		for (int i = 0; i < maior.length(); i++) {
			for (int j = 0; j < menor.length(); j++) {
				if(maior.charAt(i) == menor.charAt(j)) {
					x ++;
					break;
				}
			}
			
			
		}
		if(x >= maior.length() && maior.length() == menor.length()) {
			System.out.println("são permutações");
		}
		
		
	}
}
