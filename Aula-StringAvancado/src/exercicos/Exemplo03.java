package exercicos;

public class Exemplo03 {
	public static void main(String[] args) {
		
		System.out.printf("Olá %s!%n" /*troca o %s pelo primeiro parâmetro */, "Mundo" /* parâmetros */);
		//%s é exclusivo para string
		System.out.printf("Olá %s!%n" , "Mundo");
		//%n quebra de linha
		System.out.printf("Olá %S!%n" , "Mundo");
		//%S letra maiúscula, palavra inteira maiúscula
		
		System.out.printf("%b%n", null);//FALSE
		System.out.printf("%B%n", false);//FALSE
		System.out.printf("%B%n", true);//TRUE
		System.out.printf("%b%n", "qualquer coisa"); //TRUE
		//%b boolean
		
		char c1 = 'a';
		System.out.printf("%c%n", c1);
		//%c char
		
		System.out.printf("[%15s] [%15s]!%n" ,"Olá", "Mundo"); //15 é a quantidade de casa que a palavra vai ocupar
		//os colchetes são só representação
		System.out.printf("[%15s] [%15s]!%n" ,"Hello", "World");

		System.out.printf("[%-15s] [%-15s]!%n" ,"Olá", "Mundo"); // ao contrário 
		
		System.out.println("\n");
		System.out.printf("%-15s %-15s%n" ,"Nome", "Telefone");
		System.out.printf("%-15s %-15s%n" ,"Carlos", "75453524");
		System.out.printf("%-15s %-15s%n" ,"José", "64363636");
		
		System.out.println("\n");
		//Decimais Inteiros (byte,short,int,long) %d
		
		int i1 = 12345;
		System.out.printf("Inteiro: %d%n", i1);
		
		// Ponto flutuante (float, double) %f
		float f1 = 3.141592f;
		System.out.printf("Float: %5.2f%n", f1);
		double d1 = 3.141592213124;
		System.out.printf("Float: %5.5f%n", d1);
	}

}
