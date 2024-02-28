package exer6_OO;

public class Iniciais {
	
	public String nome;
	public char[] letras;
	
	public int x = 0;
	
	public void abreviar() {
		for (int i = 0; i < this.nome.length(); i++) {
			if(this.nome.charAt(i) == ' ') {
				this.x++;
				this.letras[this.x] = this.nome.charAt(i+1);
			}
		}
	}
		
	public void contarEspaços() {
		for (int i = 0; i < this.nome.length(); i++) { 
			if(this.nome.charAt(i) == ' ') {
				this.x ++;
			}
		}
	}

	public void printar() {
		for (int i = 0; i < this.letras.length; i++) {
			System.out.print(this.letras[i] + ".");
		}
	}
}
