package exemplos;

public class Teste {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		a1.nome = "JJ";
		a1.sobrenome = "Alves";
		a1.idade = 12;
		a1.matricula = 222222;
		
		Aluno a2 = new Aluno();
		a2.nome = "Carlos";
		a2.sobrenome = "Napa";
		a2.idade = 23;
		a2.matricula = 254232;
		
		Professor p1 = new Professor();
		p1.nome = "Jó";
		p1.sobrenome = "da Silva";
		p1.idade = 98;
		p1.area = "Filosofia";
		
		Disciplina d1 = new Disciplina();
		d1.nome = "Programação II";
		d1.ano = 2023;
		d1.professor = p1;
		d1.alunos.add(a1);	
		d1.alunos.add(a2);
		System.out.println("|Disciplina: " + d1.nome + "| |Ano: " + d1.ano + "|" +
							"\n\n|Professor: " + d1.professor.nome + " " + d1.professor.sobrenome + 
							"| |Idade: " + d1.professor.idade + 
							"| |Área: " + d1.professor.area + "|");
		for (int i = 0; i < d1.alunos.size(); i++) {
			System.out.println("\n|Aluno "  + (i+1) + ": "+ d1.alunos.get(i).nome + " " 
					+ d1.alunos.get(i).sobrenome + "| |Idade: " + d1.alunos.get(i).idade + 
					"| |Matrícula: " + d1.alunos.get(i).matricula + "|");
		}
	}


}
