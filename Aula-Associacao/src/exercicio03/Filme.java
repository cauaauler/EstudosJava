package exercicio03;

public class Filme {

	public Diretor diretor;
	public Cidade cidade;
	
	public void imprimir() {
		System.out.println(this.diretor.nome);
		System.out.println(this.diretor.sobrenome);
		System.out.println(this.diretor.premios);
		System.out.println(this.cidade.nome);
		System.out.println(this.cidade.pais);
		System.out.println(this.cidade.estado);
		System.out.println(this.cidade.numHab);
	}
}
