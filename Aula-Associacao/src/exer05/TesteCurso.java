package exer05;

public class TesteCurso {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		a1.nome = "Carlos";
		a1.idade = 16;
		
		Professor p1 = new Professor();
		p1.nome = "Márcio";
		p1.idade = 46;
		
		Disciplina d1 = new Disciplina();
		d1.professor = p1;
		d1.horas = 12;
		d1.disciplina = "Artes";
		
		Curso c1 = new Curso();
		c1.aluno = a1;
		c1.disciplina = d1;
		c1.curso = "Belas Artes";
		
		System.out.println("Curso: " + c1.curso + 
				"\nAluno: "+ c1.aluno.nome + 
				"\nDisciplina principal: " + c1.disciplina.disciplina + 
				"\nProfessor da disciplina: " + d1.professor.nome);
	}

}
