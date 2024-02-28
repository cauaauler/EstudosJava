package exemplos;

public class Exemplo2 {

	public static void main(String[] args) {

		
		Pessoa p0 = new Pessoa();
		System.out.println(p0.nome);
		System.out.println(p0.idade);
		
		Pessoa p1= new Pessoa();
		p1.nome = "Maria";
		p1.idade = 30;
		
		
		p1.falarOla(); 
		p1.imprimir();
		p1.falar("Olá");
		String r = p1.obterIdade();
		System.out.println(r);
		p1.fazerAniversario();
		System.out.println(p1.obterIdadeNum());
		
		
		
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Axl";
		p2.idade = 60;
		
		p2.imprimir();
		
		Pessoa p3 = new Pessoa();
		p3.nome = "Axl";
		p3.idade = 60;
		
		
		if (p2.nome.equals(p3.nome) && (p2.idade == p3.idade)) {
			System.out.println("Iguais");
		}
		else {
			System.out.println("Diferentes");
		}
		
		Pessoa p4 = new Pessoa();
		p4 = p3;
		if(p3 == p4) {
			System.out.println("Mesmo objeto");
		}
		
		
		
		
		
		
	}

}
