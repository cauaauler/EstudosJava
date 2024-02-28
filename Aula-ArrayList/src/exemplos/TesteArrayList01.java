package exemplos;

import java.util.ArrayList;

public class TesteArrayList01 {
	
	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Carlos");
		nomes.add("João");
		nomes.add("Leon");
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
			
		}
		
		nomes.remove(1);
		
		System.out.println("=========");
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
			
		}
		
		nomes.add(0, "Marcos");
		
		System.out.println("=========");
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
			
		}
		
		nomes.clear();
		
		System.out.println("=========");
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
			
		}
	}

}
