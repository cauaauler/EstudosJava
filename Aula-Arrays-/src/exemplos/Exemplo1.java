package exemplos;

public class Exemplo1 {

	public static void main(String[] args) {
		// Arrays de números
		
		int[] numeros = {10, 20, 30, 40};	
	
		System.out.println(numeros.length);

		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		
		// Arrays de Strings
		
		String[] nome = {"São Paulo", "Rio de Janeiro", "Porto Alegre"};
		
		for(int i = 0; i < nome.length; i++) {
			System.out.print(nome[i] + " ");
		}
		
		// Arrays de double
		// Imprima a soma dos números contidos no array
		
		
		System.out.println();
		double[] num = {2.8, 5.4, 6.6};
		double soma = 0;
		double media;
		
		for(int i = 0; i < num.length; i ++) {
			 
			 soma += num[i];
			 
		}
		
		System.out.println("Soma = " + soma);
		
		// Imprimir a media
		
		media = soma / num.length;
		System.out.println("Media = " + media);
		
	}

}
