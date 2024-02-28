package exer2;

public class Exer2 {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Carlos", 25);
		Atleta atleta = new Atleta("Jó", 60, "nado sincronizado");
		Empregado empregado = new Empregado("Marcos", 12, "Servente de pedreiro");
		
		atleta.imprimir();
		empregado.imprimir();
		
		
		
	}
	
}
