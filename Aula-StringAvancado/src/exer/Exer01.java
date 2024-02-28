package exer;

public class Exer01 {
	public static void main(String[] args) {
		String palavra = "Java";
		//char[] letras = palavra.toCharArray();
		
		
		for (int i = 0; i < palavra.length(); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(palavra.charAt(j));
				
				
			}
			System.out.println("");
			
		}
		for (int i = palavra.length(); i > 0; i--) {
			for (int j = 0; j <= i-1; j++) {
				System.out.print(palavra.charAt(j));
				
				
			}
			System.out.println("");
			
		}
		
	}

}
