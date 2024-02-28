package exercicio1;

public abstract class FiguraGeometrica {
	
	protected String nome;
	
	public FiguraGeometrica(String nome) {
	this.nome = nome;
	}
	
	abstract public double calculaPerimetro();
	
	abstract public double calculaArea();
}
