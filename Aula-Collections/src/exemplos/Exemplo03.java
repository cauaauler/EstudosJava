package exemplos;

import java.util.ArrayList;
import java.util.Collections;

public class Exemplo03 {
	
	public static void main(String[] args) {
		
		ArrayList<Pessoa> turma = new ArrayList<Pessoa>();
		
		turma.add(new Pessoa("Maria",23));
		turma.add(new Pessoa("Joaquim",25));
		turma.add(new Pessoa("Luciana",27));
		turma.add(new Pessoa("Marcos",21));
		turma.add(new Pessoa("Juliana",24));
		
		//Ordenar
		Collections.sort(turma);
		//Reverte
		//Collections.reverse(turma);
		//Embaralha
		//Collections.shuffle(turma);
		
		for (int i = 0; i < turma.size(); i++) {
			System.out.printf("%s %d, ", turma.get(i).getNome(),
					turma.get(i).getIdade());
			
		}
		//Busca binária
		int indice = Collections.binarySearch(turma, new Pessoa("Julian", 24));
		System.out.printf("%nPosição: %d",indice);
	}

}
