package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio_01_Strings {

	public static void main(String[] args) {
		// Crie um programa que leia 10 Strings do usuário (use JOptionPane) e calcule o 
		//tamanho médio das Strings. O tamanho médio deve ser armazenado em um dado do tipo 
		//double (com parte fracionária). Finalmente, o programa deve mostrar o tamanho médio 
		//usando um JoptionPane.

		int quantidade = 10;
		int caracteres = 0;
		
		for (int i = 0; i < quantidade; i++) {
			String nome = JOptionPane.showInputDialog("Informe uma palavra: ");
			caracteres += nome.length();
		}
		double media = ((double) caracteres) / ((double) quantidade);
		
		JOptionPane.showMessageDialog(null, media);
	}

}
