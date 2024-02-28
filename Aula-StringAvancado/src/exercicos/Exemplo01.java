package exercicos;

public class Exemplo01 {
	public static void main(String[] args) {
		
		// 1
		String nome = "Maria";
		// 2
		String cidade = new String("Feliz");
		// 3
		char[] letras = {'I','F','R','S'};
		String campus = new String(letras);
		
		System.out.println(nome);
		System.out.println(cidade);
		System.out.println(campus);
		
		System.out.println("-----------------------------");
		
		System.out.println(nome.startsWith("Ma")); //startsWhit() é boolean, diferencia maiúsculo de minúsculo
		System.out.println(nome.endsWith("ia"));
		
		System.out.println("-----------------------------");
		
		System.out.println(cidade.startsWith("el", 1)); //o 1 é o deslocamento em que a comando vai ler, pula a 1° letra
		
		System.out.println("-----------------------------");
		
		if(campus.startsWith("IF")) {
			System.out.println("é um instituto federal");
		}
		
		System.out.println("-----------------------------");
		
		char[] letras2 = cidade.toCharArray();
		
		for(char letra : letras2) {
			System.out.println(letra); // percorre toda a lista, não tem índice
		}
		
		String[] nomes = {"Lucas", "João", "Marcos"};
		for(String n : nomes) {
			System.out.println(n);
		}
	}

}
