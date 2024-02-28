package exemplos;

import java.util.Random;

public class Exemplo03 {

	public static void main(String[] args) {
	
		
		Random r = new Random();
		
		// System.out.println(r.nextInt(2));
		
		// Simultar 100000 lançamentos de moeda
		// Imprimir o percentual de cara e o percentual de coroa
		
		
		
		int quantidade = 100000;
		
		int cara = 0;
		int coroa = 0;
		
		
		for (int i = 0; i < quantidade; i++) {
			int lancamento = r.nextInt(2);
			
			if(lancamento == 0) {
				cara++;
			}
			else{
				coroa++;
			}
		}
	
		
		System.out.println("Percentual de cara: " + ((double)cara)*100 / quantidade + "%");
		System.out.println("Percentual de coroa: " + ((double)coroa)*100 / quantidade + "%");
	}

}
