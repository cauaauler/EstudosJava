package exerc�cio3;

public class TestaCelular {
	
	public static void main(String[] args) {
		
		Celular c = new Celular();
		
		c.marca = "x";
		c.modelo = "y";
		
		Celular c1 = new Celular();
		
		c1.marca = "x";
		c1.modelo = "y";
		
		if(c.marca.equals(c1.marca) && (c.modelo.equals(c1.modelo))) {
			System.out.println("s�o iguais");
		}else{
			System.out.println("s�o diferentes");
		}
		
	}
}
