package exemplos;

public class Exemplo01 {
	public static void main(String[] args) {
		
		Pet pet1 = new Pet();
		pet1.setNome("Tot�");
		pet1.setEspecie("Canina");
		
		Pessoa p1 = new Pessoa();
		
		p1.setNome("Maria");
		p1.setIdade(20);
		p1.setPet(pet1);
		
		System.out.println(p1.getNome());
		System.out.println(p1.getIdade());
		System.out.println(p1.getPet().getNome());
		System.out.println(p1.getPet().getEspecie());
	}
}
