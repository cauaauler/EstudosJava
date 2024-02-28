package exemplos;

abstract public class Animal {
	private String nome;

	public Animal(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// m�todo abstrato
	// As subclasses concretas de Animal
	// ter�o que implementar o m�todo abstrato abaixo.
	abstract public void emitirSom();
	
}
