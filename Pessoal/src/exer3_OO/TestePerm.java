package exer3_OO;

public class TestePerm {
	
	public static void main(String[] args) {
		
		Permutacao p = new Permutacao();
		
		p.n1 = "24222";
		p.n2 = "22422";
		
		p.n1 = p.n1.replace("0", "");
		p.n1 = p.n1.replace(" ", "");
		
		p.n2 = p.n2.replace("0", "");
		p.n2 = p.n2.replace(" ", "");
		
		p.ehMaior();
	
		p.ehPermutacao();
		
	}

}
