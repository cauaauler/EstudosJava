package exerc�cio4;

public class Aluno {
	
	public String nome;
	public String curso;
	public String data_admissao;
	public String n_matricula;
	
	public void imprimirTudo() {
		System.out.println("nome: " + this.nome + "\ncurso: " + this.curso +
							"\ndata de admiss�o: " + this.data_admissao + 
							"\nn�mero da matr�cula: " + this.n_matricula + "\n");
	}
}
