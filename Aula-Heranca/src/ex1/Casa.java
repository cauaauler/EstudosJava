package ex1;

public class Casa extends Imovel{

	public int moradores;
	
	public void Imprimir() {
		System.out.println(this.tamanho + " " + this.localidade + 
				" " + this.valor + " " + this.moradores);
	}
}
