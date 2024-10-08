package exer1;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class TesteBanda {

	private JFrame frmBandas;
	ArrayList<Banda> bandas = new ArrayList<Banda>();
	private JTextField textField_nome;
	private JTextField textField_estilo;
	private JPanel panel_cadastrar;
	private JPanel panel_remover;
	private JPanel panel_consultar;
	private JTextField textField_remover;
	private JTextPane textPane_consultar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TesteBanda window = new TesteBanda();
					window.frmBandas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TesteBanda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBandas = new JFrame();
		frmBandas.setTitle("Bandas");
		frmBandas.setBounds(100, 100, 507, 286);
		frmBandas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmBandas.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Op\u00E7\u00F5es");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntm_cadastrar = new JMenuItem("Cadastrar nova banda");
		mntm_cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBandas.getContentPane().removeAll();
				frmBandas.getContentPane().add(panel_cadastrar); 
				frmBandas.getContentPane().repaint(); 
				frmBandas.getContentPane().revalidate();
			}
		});
		mnNewMenu.add(mntm_cadastrar);
		
		JMenuItem mntm_remover = new JMenuItem("Remover uma banda");
		mntm_remover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBandas.getContentPane().removeAll();
				frmBandas.getContentPane().add(panel_remover); 
				frmBandas.getContentPane().repaint(); 
				frmBandas.getContentPane().revalidate();
			}
		});
		mnNewMenu.add(mntm_remover);
		
		JMenuItem mntm_consultar = new JMenuItem("Consultar bandas");
		mntm_consultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBandas.getContentPane().removeAll();
				frmBandas.getContentPane().add(panel_consultar); 
				frmBandas.getContentPane().repaint(); 
				frmBandas.getContentPane().revalidate();
			}
		});
		mnNewMenu.add(mntm_consultar);
		
		JMenuItem mntm_sair = new JMenuItem("Sair");
		mntm_sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // sair do programa
			}
		});
		mnNewMenu.add(mntm_sair);
		frmBandas.getContentPane().setLayout(new CardLayout(0, 0));
		
		panel_cadastrar = new JPanel();
		frmBandas.getContentPane().add(panel_cadastrar, "name_7034346774500");
		panel_cadastrar.setLayout(null);
		
		JButton btnSubmeter = new JButton("Submeter");
		btnSubmeter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Banda b = new Banda(textField_nome.getText(), textField_estilo.getText());
				bandas.add(b);
				
			}
		});
		btnSubmeter.setBounds(149, 118, 126, 23);
		panel_cadastrar.add(btnSubmeter);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(31, 34, 46, 14);
		panel_cadastrar.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Estilo");
		lblNewLabel_1.setBounds(329, 34, 46, 14);
		panel_cadastrar.add(lblNewLabel_1);
		
		textField_nome = new JTextField();
		textField_nome.setText("");
		textField_nome.setBounds(10, 59, 86, 20);
		panel_cadastrar.add(textField_nome);
		textField_nome.setColumns(10);
		
		textField_estilo = new JTextField();
		textField_estilo.setBounds(303, 59, 86, 20);
		panel_cadastrar.add(textField_estilo);
		textField_estilo.setColumns(10);
		
		panel_remover = new JPanel();
		frmBandas.getContentPane().add(panel_remover, "name_7036277853300");
		panel_remover.setLayout(null);
		
		JButton btnRemover = new JButton("Remover banda");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int indice = Integer.parseInt(textField_remover.getText());
				bandas.remove(indice);
				
			}
		});
		btnRemover.setBounds(66, 108, 130, 23);
		panel_remover.add(btnRemover);
		
		textField_remover = new JTextField();
		textField_remover.setBounds(99, 77, 86, 20);
		panel_remover.add(textField_remover);
		textField_remover.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u00CDndice da banda que deseja remover(O \u00CDNDICE PODE SER VISTO NO BOT\u00C3O CONSULTAR)");
		lblNewLabel_2.setBounds(10, 49, 468, 14);
		panel_remover.add(lblNewLabel_2);
		
		panel_consultar = new JPanel();
		frmBandas.getContentPane().add(panel_consultar, "name_7037911678400");
		panel_consultar.setLayout(null);
		
		JButton btnConsultar = new JButton("Consultar bandas");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for (int i = 0; i < bandas.size(); i++) {
					textPane_consultar.setText(textPane_consultar.getText() + i + " - Nome: " + bandas.get(i).nome + " Estilo: " + bandas.get(i).estilo + "\n");
				}
				
			}
		});
		btnConsultar.setBounds(10, 11, 145, 23);
		panel_consultar.add(btnConsultar);
		
		textPane_consultar = new JTextPane();
		textPane_consultar.setBounds(113, 45, 252, 171);
		panel_consultar.add(textPane_consultar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_consultar.setText(null);
			}
		});
		btnExcluir.setBounds(383, 93, 89, 23);
		panel_consultar.add(btnExcluir);
	}
}
