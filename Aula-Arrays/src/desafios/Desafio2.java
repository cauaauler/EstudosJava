package desafios;

public class Desafio2 {
	public static void main(String[] args) {
		
		int[] m = {7,10,13,16};
		int[] n = {2,3,5};
		
		
		for(int i=0;i<n.length;i++) {
			for (int j = 0; j < n.length; j++) {
				System.out.print(m[i]*n[j] + " ");
			}
			System.out.println("");
			
		}
		
	}
}
