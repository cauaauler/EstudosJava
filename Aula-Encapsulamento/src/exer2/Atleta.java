package exer2;

public class Atleta extends Pessoa{

	private String modalidade;

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public Atleta(String nome, int idade, String modalidade) {
		super(nome, idade);
		this.modalidade = modalidade;
		
	}
	public void imprimir() {
		System.out.println("-------------");
		System.out.println(this.getNome());
		System.out.println(this.getIdade());
		System.out.println(this.modalidade);
	}
	
	
}
