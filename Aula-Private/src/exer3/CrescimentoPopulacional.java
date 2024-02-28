package exer3;

public class CrescimentoPopulacional {
	
	private double populacaoA;
	private double populacaoB;
	private double taxaA;
	private double taxaB;
	
	public int x;
	
	public double getPopulacaoA() {
		return populacaoA;
	}
	public void setPopulacaoA(double populacaoA) {
		this.populacaoA = populacaoA;
	}
	public double getPopulacaoB() {
		return populacaoB;
	}
	public void setPopulacaoB(double populacaoB) {
		this.populacaoB = populacaoB;
	}
	public double getTaxaA() {
		return taxaA;
	}
	public void setTaxaA(double taxaA) {
		this.taxaA = taxaA;
	}
	public double getTaxaB() {
		return taxaB;
	}
	public void setTaxaB(double taxaB) {
		this.taxaB = taxaB;
	}
	
	public int calculaAnos() {
		if(this.populacaoB < this.populacaoA) {
			return 0;
		}else if (this.taxaA > this.taxaB){
			while(populacaoB > populacaoA) {
				populacaoA = populacaoA*taxaA;
				populacaoB = populacaoB*taxaB;
				x++;
			}
		}
		return x;
	}

}
