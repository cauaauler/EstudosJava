package exemplo02;

public class Celular {
	
	public String modelo;
	public boolean usado;
	public Fabricante fabricante;
	
	public void imprimir() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Usado: " + this.usado);
		System.out.println("Nome do fabricante: " + this.fabricante.nome);
		System.out.println("Pa�s do fabricante: " + this.fabricante.pais);
	}

}
