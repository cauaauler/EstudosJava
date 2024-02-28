package exemplos;

public class Motorista {
	private int idade;

	public Motorista(int idade) throws Exception {
		super();
		this.setIdade(idade);
	}

	public int getIdade() {
		return idade;
	}
	
	//CHECADA - QUANDO A FUNÇÃO FOR MUITO IMPORTANTE DE TER ARTIFICIAL
	public void setIdade(int idade) throws Exception {
		if(idade < 18) {
			throw new Exception("Motorista não pode ser de menor.");
		}
		this.idade = idade;
		
	}
	// NÃO CHECADA
//	public void setIdade(int idade) {
//		if(idade < 18) {
//			throw new RuntimeException("Motorista não pode ser de menor.");
//		}
//		this.idade = idade;
//		
//	}
	
	 

}
