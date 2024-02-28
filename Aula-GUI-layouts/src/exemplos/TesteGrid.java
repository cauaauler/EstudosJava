package exemplos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;

public class TesteGrid {

	private JFrame frmColumnscolunasRowslinhas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TesteGrid window = new TesteGrid();
					window.frmColumnscolunasRowslinhas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TesteGrid() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmColumnscolunasRowslinhas = new JFrame();
		frmColumnscolunasRowslinhas.setTitle("columns(colunas) - rows(linhas) vgap e hgap espa\u00E7o entre os bot\u00F5es");
		frmColumnscolunasRowslinhas.setBounds(100, 100, 634, 478);
		frmColumnscolunasRowslinhas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmColumnscolunasRowslinhas.getContentPane().setLayout(new GridLayout(3, 4, 10, 10));
		
		JButton btnNewButton_8 = new JButton("New button");
		frmColumnscolunasRowslinhas.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_2 = new JButton("New button");
		frmColumnscolunasRowslinhas.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_7 = new JButton("New button");
		frmColumnscolunasRowslinhas.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_1 = new JButton("New button");
		frmColumnscolunasRowslinhas.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("New button");
		frmColumnscolunasRowslinhas.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("New button");
		frmColumnscolunasRowslinhas.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("New button");
		frmColumnscolunasRowslinhas.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_3 = new JButton("New button");
		frmColumnscolunasRowslinhas.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("New button");
		frmColumnscolunasRowslinhas.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_9 = new JButton("New button");
		frmColumnscolunasRowslinhas.getContentPane().add(btnNewButton_9);
	}

}
