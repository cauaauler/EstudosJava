package exemplos;

import javax.swing.JOptionPane;

public class Exemplo04 {

	public static void main(String[] args) {
	
		JOptionPane.showMessageDialog(null, "Ol� Mundo Cruel!");
		
		String nome = JOptionPane.showInputDialog("Informe o seu nome:");
		
		if((nome == null) || (nome.length() == 0)) {
			nome = "An�nimo";
		}
		
		if(nome.equals("admin")) {
			nome = "Administrador";
		}
		
		JOptionPane.showMessageDialog(null, "Ol� " + nome);

	}

}
