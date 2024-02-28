package exer2;

public class Computador {
	
	private Processador processador;
	private Memoria memoria;
	private Disco disco;
	
	public Processador getProcessador() {
		return processador;
	}
	public void setProcessador(Processador processador) {
		this.processador = processador;
	}
	public Memoria getMemoria() {
		return memoria;
	}
	public void setMemoria(Memoria memoria) {
		this.memoria = memoria;
	}
	public Disco getDisco() {
		return disco;
	}
	public void setDisco(Disco disco) {
		this.disco = disco;
	}
	
	public Computador(Processador processador, Memoria memoria, Disco disco) {
		super();
		this.processador = processador;
		this.memoria = memoria;
		this.disco = disco;
	}
	
	

}
