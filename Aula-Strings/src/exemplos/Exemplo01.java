package exemplos;

public class Exemplo01 {

	public static void main(String[] args) {

		String cidade = "Alto Feliz";
		
		System.out.println(cidade.charAt(0));
		
		System.out.println(cidade.length());
		
		// laço de repetição para imprimir todos os char
		System.out.println();
		
		for(int i = 0; i < cidade.length(); i++) {
			System.out.println(cidade.charAt(i));
		}

		
		int n1 = 10;
		int n2 = 20;
		
		// imprimir na frente do 30 a palavra "soma: "
		System.out.println("Soma: " + (n1 + n2));
	
		String frase = "Programar em Java";
		String[] palavras = frase.split(" ");
		
		for(int i = 0; i < palavras.length; i++) {
			System.out.println(palavras[i]);
		}
	}

}
