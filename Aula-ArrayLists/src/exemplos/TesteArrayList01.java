package exemplos;

import java.util.ArrayList;

public class TesteArrayList01 {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Joana");
		nomes.add("Márcio");
		nomes.add("Lúcia");
		
		//System.out.println(nomes.get(2));
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		
		nomes.remove(1);
	
		System.out.println();
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
	
		nomes.add(0, "Lucas");
		
		System.out.println();
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		
		nomes.clear();
		
		//add = adicionar
		//get = retornar/lê
		//size = tamanho 
		// clear = reset/limpa
		
	}

}
