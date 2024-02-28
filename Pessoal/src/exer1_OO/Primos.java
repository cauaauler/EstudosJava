package exer1_OO;

public class Primos {
	
	public int n;
	
	public boolean testarPrimo() {
		 for (int j = 2; j < n; j++) {
	            if (n % j == 0)
	                return false;   
	        }
	        return true;

	}

}
