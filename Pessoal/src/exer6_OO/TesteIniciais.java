package exer6_OO;

public class TesteIniciais {
	
	public static void main(String[] args) {
		
		Iniciais n1 = new Iniciais();
		
		n1.nome = "Cauã Fabrício Auler";
		
		n1.contarEspaços();
		
		n1.letras = new char[n1.x+1];
		n1.letras[0] = n1.nome.charAt(0);
		
		n1.x = 0;
		n1.abreviar();
		
		n1.printar();
		
	}

}
