package exercicio1;

public class Circulo extends FiguraGeometrica {

	private double raio;

	public Circulo(String nome, double raio) {
		super(nome);
		this.raio = raio;
	}

	
	public double calculaPerimetro() {
		double perimetro = 2*Math.PI*this.raio;
		return perimetro;
	}

	
	public double calculaArea() {
		double area = Math.PI*Math.pow(this.raio, 2);
		return area;
	}
}
	
