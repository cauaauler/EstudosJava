package exer03;

public class Filme {
	public Diretor diretor;
	public Cidade cidade;
	
	public void imprimir() {
		System.out.println("Nome do diretor: " + this.diretor.nome);
		System.out.println("Quantidade de prêmios: " + this.diretor.premios);
		
		System.out.println("Nome da cidade: " + this.cidade.nome);
		System.out.println("Nome do estado: " + this.cidade.estado);
		System.out.println("Nome do país: " + this.cidade.pais);
		System.out.println("Quantidade de habitantes: " + this.cidade.habitantes);
		
	}

}
