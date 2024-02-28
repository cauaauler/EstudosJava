package ex1;

public class Fazenda extends Imovel{

	public int qtdAnimais;
	
	public void Imprimir() {
		System.out.println(this.tamanho + " " + this.localidade + " " + 
					this.valor + " " + this.qtdAnimais);
	}
}
