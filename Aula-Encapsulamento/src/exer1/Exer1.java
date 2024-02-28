package exer1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer1 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		
		
		boolean x = true;
		int z = 0;
		while(x) {
			ArrayList<Contrato> contratos = new ArrayList<Contrato>();
			Contrato contrato = new Contrato();
			Empresa contratante = new Empresa();
			Empresa contratado = new Empresa();
			
			contratante.setNome(leitor.nextLine());
			contratante.setCnpj(leitor.nextLine());
			contratado.setNome(leitor.nextLine());
			contratado.setCnpj(leitor.nextLine());
			
			contrato.setValor(Double.parseDouble(leitor.nextLine()));
			contrato.setContratante(contratante);
			contrato.setContratado(contratado);
			
			contratos.add(contrato);
			
			
			//ta funcionando só precisa dos sysout
			System.out.println(contratos.get(z));
			System.out.println(contratos.get(z));
			
			z++;
		}
		
		
	}

}
