package exemplos;

public class Teste {
	
	public static void main(String[] args) {
		
		Cidade c1 = new Cidade("Feliz", "Brasil", 15000);
		Pessoa p1 = new Pessoa("Cauã", "Auler", 16, 1.70, "Feliz", c1); //Pessoa() é o construtor
		System.out.println(p1.getNome());
		System.out.println(p1.getSobrenome());
		System.out.println(p1.getIdade());
		System.out.println(p1.getAltura());
		System.out.println(p1.getEndereco());
		System.out.println(p1.getCidade().getNome());
		System.out.println(p1.getCidade().getPais());
		System.out.println(p1.getCidade().getHabitantes());
		
		
	}

}
