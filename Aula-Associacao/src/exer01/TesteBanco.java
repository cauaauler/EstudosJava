package exer01;

public class TesteBanco {
	
	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.saldo = 2000;
		
		
		c1.sacar(2001);
		System.out.println(c1.saldo);
		
		Conta c2 = new Conta();
		c2.saldo = 300;
		
		c2.transferencia(2000, c1);
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);
				
	}

}
