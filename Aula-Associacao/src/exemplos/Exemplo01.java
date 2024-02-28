package exemplos;

public class Exemplo01 {

	public static void main(String[] args) {

		Pet pet1 = new Pet();
		pet1.nome = "Lessie";
		pet1.idade = 10;

		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Marry";
		pessoa1.pet = pet1;

		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.pet.nome);
		System.out.println(pessoa1.pet.idade);

		// Criar um novo pet e uma nova pessoa
		// Associar a ambos
		// Imprimir nomes e idade usando onjeto da pessoa

		Pet pet2 = new Pet();
		pet2.nome = "Lola";
		pet2.idade = 2;

		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Jack";
		pessoa2.pet = pet2;

		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.pet.nome);
		System.out.println(pessoa2.pet.idade);

		// Ctrl + Shift + S  --> Salvar todos os documentos
		// Ctrl + I    --> Idents o código atual (selecionar tudo)
		// Ctrl + A + Ctrl + I
		
	}

}
