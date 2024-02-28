package exemplo;

import java.util.Scanner;

public class Exemplo5 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int numero = Integer.parseInt(leitor.nextLine());

		switch(numero){
		
			case 0: {
				System.out.println("Zero!");
				//break; //break no final 
			}
			case 1: {
				System.out.println("Um!");
				//break; 
		
			}
			case 2: {
				System.out.println("Dois!");
				//break;
			}
			default: {
				System.out.println("Outro número!");
			}
			
		}
}
	

}
