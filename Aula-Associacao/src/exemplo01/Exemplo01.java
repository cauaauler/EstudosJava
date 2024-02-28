package exemplo01;

public class Exemplo01 {
	
	public static void main(String[] args) {
		
		Pet pet1 = new Pet();
		pet1.nome = "marlon";
		pet1.idade = 612;
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "caua";
		pessoa1.pet = pet1; // pet1 é da pessoa1
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.pet.nome);
		System.out.println(pessoa1.pet.idade);
		System.out.println();
		
		Pet pet2 = new Pet();
		pet2.nome = "xxx";
		pet2.idade = 2;
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "jao";
		pessoa2.pet = pet2;
		
		
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.pet.nome);
		System.out.println(pessoa2.pet.idade);
	}

}
