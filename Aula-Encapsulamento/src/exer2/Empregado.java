package exer2;

public class Empregado extends Pessoa{

	private String empresa;

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Empregado(String nome, int idade, String empresa) {
		super(nome, idade);
		this.empresa = empresa;
		
	}
	public void imprimir() {
		System.out.println("-------------");
		System.out.println(this.getNome());
		System.out.println(this.getIdade());
		System.out.println(this.empresa);
	}
	
	
	
	
}
