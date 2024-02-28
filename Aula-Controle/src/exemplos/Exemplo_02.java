package Exemplos;

import java.util.Scanner;

public class Exemplo_02 {

	public static void main(String[] args) {
	
		for(int i=0; i<10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i=9; i>=0; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();

		for(int i=9; i>=1; i-=2 ) {
			System.out.print(i + " ");	
		}
		
		System.out.println();
		
		for(int i=2; i<=64; i*=2 ) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<=3; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}	