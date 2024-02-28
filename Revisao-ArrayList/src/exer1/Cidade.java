package exer1;

public class Cidade {
	
	private String estado;
	private String nome;
	private String pais;
	private Prefeito prefeito;
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
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
	public Prefeito getPrefeito() {
		return prefeito;
	}
	public void setPrefeito(Prefeito prefeito) {
		this.prefeito = prefeito;
	}
	
	public Cidade(String estado, String nome, String pais, Prefeito prefeito) {
		super();
		this.estado = estado;
		this.nome = nome;
		this.pais = pais;
		this.prefeito = prefeito;
	}
	
	

}
