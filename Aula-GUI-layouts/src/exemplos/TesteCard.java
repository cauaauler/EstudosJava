package exemplos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.BorderLayout;

public class TesteCard {

	private JFrame frame;
	
	private JPanel panel_verde;
	private JPanel panel_azul;
	private JPanel panel_vermelho;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TesteCard window = new TesteCard();
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
	public TesteCard() {
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
		
		JMenu mnNewMenu = new JMenu("Cores");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Azul");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll(); // remover todos os panel
				frame.getContentPane().add(panel_azul); 
				// repaint e revalidate dão refresh na interface gráfica, porque no código de cima não troca no GUI
				frame.getContentPane().repaint(); 
				frame.getContentPane().revalidate();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Vermelho");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll(); 
				frame.getContentPane().add(panel_vermelho); 
				frame.getContentPane().repaint(); 
				frame.getContentPane().revalidate();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Verde");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll(); 
				frame.getContentPane().add(panel_verde); 
				frame.getContentPane().repaint(); 
				frame.getContentPane().revalidate();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		panel_azul = new JPanel();
		panel_azul.setBackground(new Color(102, 153, 255));
		frame.getContentPane().add(panel_azul, "name_7034310418500");
		
		panel_vermelho = new JPanel();
		panel_vermelho.setBackground(new Color(220, 20, 60));
		frame.getContentPane().add(panel_vermelho, "name_7034327474900");
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(panel_vermelho, popupMenu);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("teste");
		popupMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("teste2");
		popupMenu.add(mntmNewMenuItem_3);
		
		panel_verde = new JPanel();
		panel_verde.setBackground(new Color(0, 128, 0));
		frame.getContentPane().add(panel_verde, "name_7034345148800");
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
