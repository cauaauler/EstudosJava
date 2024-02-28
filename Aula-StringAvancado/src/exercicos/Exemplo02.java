package exercicos;

public class Exemplo02 {
	public static void main(String[] args) {
		String frase = "Instituto Federal do RS";
		
		String sub1 = frase.substring(5);
		System.out.println(sub1);
		
		System.out.println(frase.substring(5, 10)); //o dez não entra
		
		String[] palavras = frase.split(" ");
		
		for(String palavra : palavras) {
			System.out.println(palavra);
		}
		
		String input = "3;5;1;3";
		
		String[] numeros = input.split(";");
		
		int soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma += Integer.parseInt(numeros[i]);
		}
		System.out.println(soma);
		
		String nomes = "Maria,Joaquim,Luana,Marcela";
		
		String[] nomesArray = nomes.split(",");
		
		double somaCaracteres = 0;
		for (int i = 0; i < nomesArray.length; i++) {
			somaCaracteres += nomesArray[i].length();
			
		}
		double mediaCaracteres = somaCaracteres/nomesArray.length;
		System.out.println(mediaCaracteres);
	}
	
		
}
