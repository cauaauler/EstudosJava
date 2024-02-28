package exemplos;

public class Cidade {
	
	private String nome;
	private String pais;
	private int habitantes;
	
	public Cidade(String nome, String pais, int habitantes) {
		super();
		this.nome = nome;
		this.pais = pais;
		this.habitantes = habitantes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	
	
	
}
