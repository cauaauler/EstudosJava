package exer2_OO;

import java.util.Random;
import java.util.Scanner;

public class TesteSorteio {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Sorteio s = new Sorteio();
		Random r = new Random();
		
		s.n = r.nextInt(1000);
		
		//System.out.println(s.n);
		
		while(s.n != s.palpite) {
			System.out.println("palpite");
			s.palpite = Integer.parseInt(leitor.nextLine());
			s.ehIgual();
		}
		
	}

}
