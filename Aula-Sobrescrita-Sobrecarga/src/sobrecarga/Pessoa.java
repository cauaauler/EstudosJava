package sobrecarga;

public class Pessoa {
	private String nome;
	
	public void falar() {
		System.out.println("Bom dia !");
	}
	
	public void falar(String frase) {
		System.out.println(frase);
	}
	/*
	public void falar(String nome) {
		System.out.println(nome);
	}
	*/ //não pede dois com os mesmos parametros, não importa se o nome da variável é diferente
	public void falar(String frase, int vezes) {
		for (int i = 0; i < vezes; i++) {
			System.out.println(frase);
		}
	}
	public void falar(int vezes, String frase) {
		for (int i = 0; i < vezes; i++) {
			System.out.println(frase + "."); //pode inverter os parametros e o a função fica diferente
		}
	}
	public void somar(int a, int b) {
		System.out.println(a+b);
	}
	public void somar(double a, int b) {
		System.out.println(a+b);
	}
}
