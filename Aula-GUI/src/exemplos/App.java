package exemplos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class App {

	private JFrame App;
	private JTextField textFieldNome;
	private JLabel lblNewLabel;
	private JLabel lblSaida;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.App.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		App = new JFrame();
		App.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		App.getContentPane().setBackground(Color.LIGHT_GRAY);
		App.getContentPane().setForeground(Color.BLACK);
		App.getContentPane().setLayout(null);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(10, 45, 261, 23);
		App.getContentPane().add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println(textFieldNome.getText());
				lblSaida.setText(textFieldNome.getText());
			}
		});
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOK.setBounds(10, 79, 89, 23);
		App.getContentPane().add(btnOK);
		
		lblNewLabel = new JLabel("Digite seu nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 206, 23);
		App.getContentPane().add(lblNewLabel);
		
		lblSaida = new JLabel("");
		lblSaida.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSaida.setBounds(10, 119, 249, 23);
		App.getContentPane().add(lblSaida);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(281, 50, 388, 265);
		App.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(textFieldNome.getText() + "\n"); // Não apaga tudo
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(127, 79, 121, 23);
		App.getContentPane().add(btnNewButton);
		App.setResizable(false);
		App.setTitle("Appzord");
		App.setBounds(100, 100, 711, 432);
		App.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
