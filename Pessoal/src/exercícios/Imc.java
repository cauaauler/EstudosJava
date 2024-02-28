package exerc�cios;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Altura(metros): ");
		float altura = Float.parseFloat(leitor.nextLine());
		
		System.out.print("Peso(quilos): ");
		float peso = Float.parseFloat(leitor.nextLine());
		
		float imc = peso/(altura*altura);
		String classifica�ao = "";
		
		if(imc<=18.5) {
			classifica�ao = "abaixo do peso";	
		}
		else if(imc>18.5 && imc<25) {
			classifica�ao = "peso normal";
		}
		else if(imc>=25 && imc<30) {
			classifica�ao = "pr�-obesidade";
		}
		else if(imc>=30 && imc<35) {
			classifica�ao = "obesidade de grau 1";
		}
		else if(imc>=35 && imc<40) {
			classifica�ao = "obesidade de grau 2";
		}
		else {
			classifica�ao = "obesidade de grau 3";
		}
		System.out.println(classifica�ao);

	}

}
