package exer1;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		ArrayList<Cidade> cidades = new ArrayList<Cidade>();
		
		Prefeito p1 = new Prefeito("Carlos", "PSP");
		Prefeito p2 = new Prefeito("Carlinhos", "PST");
		Prefeito p3 = new Prefeito("Carlão", "PSK");
		
		Cidade c1 = new Cidade("liquido", "carlos", "joao e carla", p1);
		Cidade c2 = new Cidade("solido", "ronaldo", "brasil", p2);
		Cidade c3 = new Cidade("gasoso", "pelé", "brazil", p3);
		
		cidades.add(c1);
		cidades.add(c2);
		cidades.add(c3);
		
		System.out.println("ok");
		String removerCidade = leitor.nextLine();
		
		for (int i = 0; i < cidades.size(); i++) {
			if(removerCidade.equals(cidades.get(0).getNome())) {
				cidades.remove(i);
			}
		}
		
		
		for (int i = 0; i < cidades.size(); i++) {
			if(removerCidade.equals(cidades.get(i).getNome())) {
				System.out.println(cidades.get(i).getNome() + cidades.get(i).getNome());
			}
		}
		
	}

}
