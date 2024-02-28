package exer02;

public class Cidade {
	private String nome;
	private int nHabitantes;
	
	public Cidade(String nome, int nHabitantes) {
		super();
		this.nome = nome;
		this.nHabitantes = nHabitantes;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getnHabitantes() {
		return nHabitantes;
	}
	public void setnHabitantes(int nHabitantes) {
		this.nHabitantes = nHabitantes;
	}
	//criar uma exceção de numero de caracteres
	

}
