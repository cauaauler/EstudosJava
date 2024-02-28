package desafios;

public class Desafio1 {
	public static void main(String[] args) {
		
		char[] letras = {'S', 'R', 'F', 'I'};
		
		for(int i = letras.length;i>=0;i--) {
			for(int x = letras.length-1;x >= i;x--) {
				
				System.out.print(letras[x]);	
			}
			System.out.println("");
			
			
			
		}
	}
}	
