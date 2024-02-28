import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
    	InputStreamReader ir = new InputStreamReader(System.in);
    	BufferedReader leitor = new BufferedReader(ir);
    	
    	int n1 = Integer.parseInt(leitor.readLine());
    	
    	int inicio = Integer.parseInt(leitor.readLine());
    	int fim = Integer.parseInt(leitor.readLine());
    	
    	int tempo = 0;
    	if(fim < inicio) {
    		tempo = 24 - inicio + fim;
    	}else {
    		tempo = fim - inicio;
    	}
    	if(tempo < 24 || tempo > 1) {
    		System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
    	}
    	
    	
        
		}
                
		
}       
       
        
   
