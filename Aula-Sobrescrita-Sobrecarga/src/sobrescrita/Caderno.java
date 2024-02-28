package sobrescrita;

public class Caderno extends Produto{
	private int nFolhas;
	private boolean capaDura;
	
	public Caderno(int codigo, int nFolhas, boolean capaDura) {
		super(codigo);
		this.nFolhas = nFolhas;
		this.capaDura = capaDura;
	}
	public void imprimir() { 
		super.imprimir(); // Vai chamar o m�todo do produto
		System.out.println("N�mero de Folhas: " + this.nFolhas);
		System.out.println("Capa Dura: " + this.capaDura);
	}
}
