package exer1;

import java.util.ArrayList;

public class Exer1 {
	
	public static void main(String[] args) {
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(new Pessoa("943.542.124-13", "Claudio", 15));
		pessoas.add(new Pessoa("654.641.742-43", "Romualdo", 12));
		pessoas.add(new Pessoa("123.563.633-21", "Rinocerote", 25));
		pessoas.add(new Pessoa("143.542.124-13", "Mario", 55));
		
		
		//como se fosse a pessoa digitando
		String cpfRemover = "143.542.124-13";
		for (int i = 0; i < pessoas.size(); i++) {
			if(cpfRemover == pessoas.get(i).getCpf()) {
				pessoas.remove(i);
				
			}
				
		}
		
		//achar nome com o cpf
		String nomeCpf = "943.542.124-13";
		
		for (int i = 0; i < pessoas.size(); i++) {
			if(nomeCpf == pessoas.get(i).getCpf()) {
				System.out.println(pessoas.get(i).getNome());
			}
		}

		int tamanhoFixo = pessoas.size(); //essa variável é porque o size vai diminuir
		//remover todo mundo
		for (int i = 0; i < tamanhoFixo; i++) {
			pessoas.remove(0);
			
		}
		
		
	}

}
