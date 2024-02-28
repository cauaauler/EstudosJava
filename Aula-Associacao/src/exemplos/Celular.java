package exemplos;

public class Celular {

	public String modelo;
	public boolean usado;
	public Fabricante fabricante;
	
	public void imprimir() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Usado: " + this.usado);
		System.out.println("Nome do Fabricante: " + this.fabricante.nome);
		System.out.println("Pa�s do Fabricante: " + this.fabricante.pais);
	}
}
