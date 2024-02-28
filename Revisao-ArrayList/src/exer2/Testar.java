package exer2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTree;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLayeredPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;

public class Testar {

	private JFrame frame;
	private JPanel panelAdicionar;
	private JPanel panelCpu;
	private JPanel panelHd;
	private JPanel panelRam;
	private JTextField textFieldCpu;
	private JTextField textFieldRam;
	private JTextField textFieldHd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Testar window = new Testar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Testar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmAdicionar = new JMenuItem("Adicionar");
		mntmAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll(); 
				frame.getContentPane().add(panelAdicionar); 
				frame.getContentPane().repaint(); 
				frame.getContentPane().revalidate();
			}
		});
		mnMenu.add(mntmAdicionar);
		
		JMenu mnBuscar = new JMenu("Buscar");
		mnMenu.add(mnBuscar);
		
		JMenuItem mntmCpu = new JMenuItem("Processador");
		mntmCpu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll(); 
				frame.getContentPane().add(panelCpu); 
				frame.getContentPane().repaint(); 
				frame.getContentPane().revalidate();
			}
		});
		mnBuscar.add(mntmCpu);
		
		JMenuItem mntmRam = new JMenuItem("Memoria");
		mntmRam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll(); 
				frame.getContentPane().add(panelCpu); 
				frame.getContentPane().repaint(); 
				frame.getContentPane().revalidate();
			}
		});
		mnBuscar.add(mntmRam);
		
		JMenuItem mntmHd = new JMenuItem("Disco");
		mntmHd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll(); 
				frame.getContentPane().add(panelHd); 
				frame.getContentPane().repaint(); 
				frame.getContentPane().revalidate();
			}
		});
		mnBuscar.add(mntmHd);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		panelAdicionar = new JPanel();
		frame.getContentPane().add(panelAdicionar, "name_7055780764900");
		panelAdicionar.setLayout(null);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ram = Integer.parseInt(textFieldRam.getText());
				Memoria memoria = new Memoria(ram);
				int cpu = Integer.parseInt(textFieldCpu.getText());
				Processador processador = new Processador(cpu);
				int hd = Integer.parseInt(textFieldHd.getText());
				Disco disco = new Disco(hd);
				Computador computador = new Computador(processador, memoria, disco);
				ArrayList<Computador> computadores = new ArrayList<Computador>();
				computadores.add(computador);
				System.out.println(computadores.get(0).getMemoria().getTamanhoMemoria());
				//adicionar pronto
				
			}
		});
		btnAdicionar.setBounds(157, 150, 89, 23);
		panelAdicionar.add(btnAdicionar);
		
		textFieldCpu = new JTextField();
		textFieldCpu.setBounds(297, 31, 86, 20);
		panelAdicionar.add(textFieldCpu);
		textFieldCpu.setColumns(10);
		
		textFieldRam = new JTextField();
		textFieldRam.setBounds(297, 62, 86, 20);
		panelAdicionar.add(textFieldRam);
		textFieldRam.setColumns(10);
		
		textFieldHd = new JTextField();
		textFieldHd.setBounds(297, 93, 86, 20);
		panelAdicionar.add(textFieldHd);
		textFieldHd.setColumns(10);
		
		JLabel lblCpu = new JLabel("CPU : ");
		lblCpu.setBounds(225, 34, 46, 14);
		panelAdicionar.add(lblCpu);
		
		JLabel lblRam = new JLabel("RAM : ");
		lblRam.setBounds(225, 65, 46, 14);
		panelAdicionar.add(lblRam);
		
		JLabel lblHd = new JLabel("HD : ");
		lblHd.setBounds(225, 96, 46, 14);
		panelAdicionar.add(lblHd);
		
		panelRam = new JPanel();
		frame.getContentPane().add(panelRam, "name_7070110580100");
		panelRam.setLayout(null);
		
		panelCpu = new JPanel();
		frame.getContentPane().add(panelCpu, "name_7071811367600");
		panelCpu.setLayout(null);
		
		panelHd = new JPanel();
		frame.getContentPane().add(panelHd, "name_7073914996700");
		panelHd.setLayout(null);
	}
}
