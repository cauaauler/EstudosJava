package exercício4;

public class Aluno {
	
	public String nome;
	public String curso;
	public String data_admissao;
	public String n_matricula;
	
	public void imprimirTudo() {
		System.out.println("nome: " + this.nome + "\ncurso: " + this.curso +
							"\ndata de admissão: " + this.data_admissao + 
							"\nnúmero da matrícula: " + this.n_matricula + "\n");
	}
}
