package exer02;

public class TesteCarro {
	
	public static void main(String[] args) {
		
		Roda r1 = new Roda();
		r1.tamanho = "15 cm";
		
		Roda r2 = new Roda();
		r2.tamanho = "15 cm";
		
		Roda r3 = new Roda();
		r3.tamanho = "20 cm";
		
		Roda r4 = new Roda();
		r4.tamanho = "20 cm";
		
		Motor m1 = new Motor();
		m1.cilindros = "20";
		m1.potencia = "300 cv";
		
		Carro c1 = new Carro();
		c1.modelo = "Honda Civic";
		c1.motor = m1;
		c1.r1 = r1;
		c1.r2 = r2;
		c1.r3 = r3;
		c1.r4 = r4;
		
		System.out.println("Modelo: " + c1.modelo + 
				"\nMotor: " + c1.motor.cilindros + " cilindros e " + c1.motor.potencia +
				"\nPneu1: " + c1.r1.tamanho +
				"\nPneu2: " + c1.r2.tamanho +
				"\nPneu3: " + c1.r3.tamanho +
				"\nPneu4: " + c1.r4.tamanho );
	}

}
