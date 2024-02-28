package exercicios;

import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Quilometragem inicial do carro: ");
		int km_inicial = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Quilometragem final do carro: ");
		int km_final = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Litros de combustível gastos: ");
		int litros = Integer.parseInt(leitor.nextLine());
		
		int km_total = km_final - km_inicial;
		int gasto = km_total / litros;
		
		System.out.println("Média de consume de gasolina por "
				+ "quilômetro rodado: "+gasto);

	}

}