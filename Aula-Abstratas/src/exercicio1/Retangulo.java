package exercicio1;

public class Retangulo extends FiguraGeometrica {

	private double lado1;
	private double lado2;
	
	public Retangulo(String nome, double lado1, double lado2) {
		super(nome);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	
	public double calculaPerimetro() {
		double perimetro = this.lado1*2 + this.lado2*2;
		return perimetro;
	}

	
	public double calculaArea() {
		double area = lado1*lado2;
		return area;
	}

	
	
}
