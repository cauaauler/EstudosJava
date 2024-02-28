package exer3;

public class Exer03 {
	
	public static void main(String[] args) {
		
		CrescimentoPopulacional c = new CrescimentoPopulacional();
		
		c.setPopulacaoA(2000);
		c.setPopulacaoB(3000);
		c.setTaxaA(1.1);
		c.setTaxaB(1);
		
		System.out.println("Demoraram " + c.calculaAnos() + " anos, para a população de A passar a população de B");
	}

}
