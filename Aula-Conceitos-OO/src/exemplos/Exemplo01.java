package exemplos;

public class Exemplo01 {
	
	public static void main(String[] args) {
		
		Pessoa p0 = new Pessoa();
		System.out.println(p0.idade);
		System.out.println(p0.nome);
		
		Pessoa p1 = new Pessoa();
		
		p1.nome = "Cauã";
		p1.idade = 16;
		
		p1.falarOla();
		p1.imprimir();
		p1.falar("Cauã é muito pika");
		String r = p1.obterIdade();
		
		int i = p1.obterIdadeNum();
		System.out.println(i);
		System.out.println(r);
		
		System.out.println(p1.obterIdadeNum());
		p1.fazerAniversario();
		System.out.println(p1.obterIdadeNum());
		
		Pessoa p2 = new Pessoa();
		
		p2.nome = "rogerio";
		p2.idade = 10;
		
		p2.imprimir();
		p2.falar("Cauã é muito pika");
		
		Pessoa p3 = new Pessoa();
		
		p3.nome = "rogerio";
		p3.idade = 10;
		
		if(p2 == p3) {
			System.out.println("Iguais");
		}else {
			System.out.println("Diferentes"); 
		}
		// são diferentes porque os objetos podem até ter as mesmas características mas ainda são diferentes
		if(p2.nome.equals(p3.nome) && (p2.idade == p3.idade)) {
			System.out.println("Iguais");
		}else {
			System.out.println("Diferentes");
		}
		// ver se as características são iguais
		Pessoa p4 = p3;
		if(p3 == p4) {
			System.out.println("Mesmo objeto");
		}
	}
	

}
