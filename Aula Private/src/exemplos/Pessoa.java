package exemplos;

public class Pessoa {
	
	private String nome;
	private int idade;
	private Pet pet;
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getNome() {
		return this.nome;
	}
	
	
	public void setIdade(int idade) {
		if(idade >= 0) {
			this.idade = idade;
		}
	}
	
	
	public int getIdade() {
		return this.idade;
	}
	
	
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	
	public Pet getPet() {
		return this.pet;
	}
}
