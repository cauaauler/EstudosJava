package exercício2;

public class Calculadora {
	
	public int n1;
	public int n2;
	public int numeros[] = {3, 4, 5, 6};
	public int x;
	
	public int soma() {
		return this.n1 + this.n2;
	}
	public int subtracao() { 
		return this.n1 - this.n2;
	}
	public int multiplicacao() {
		return this.n1 * this.n2;
	}
	public int divisao() {
		return this.n1 / this.n2;
	}
	public int media() {
		for (int i = 0; i < this.numeros.length; i++) {
			x += this.numeros[0];
		}
		return x / this.numeros.length;
	}

}
