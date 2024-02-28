package exemplos;

import javax.swing.JOptionPane;

public class Exemplo04 {

	public static void main(String[] args) {
	
		JOptionPane.showMessageDialog(null, "Olá Mundo Cruel!");
		
		String nome = JOptionPane.showInputDialog("Informe o seu nome:");
		
		if((nome == null) || (nome.length() == 0)) {
			nome = "Anônimo";
		}
		
		if(nome.equals("admin")) {
			nome = "Administrador";
		}
		
		JOptionPane.showMessageDialog(null, "Olá " + nome);

	}

}
