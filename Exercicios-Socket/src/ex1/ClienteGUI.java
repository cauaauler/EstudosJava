package ex1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.awt.event.ActionEvent;
import java.awt.Font;



public class ClienteGUI {

	private JFrame frmCliente;
	private JTextField textField;
	private JTextArea textArea;
	private JButton btnEnviar;
	private Socket cliente;
	private PrintWriter saida;
	private BufferedReader entrada;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteGUI window = new ClienteGUI();
					window.frmCliente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ClienteGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCliente = new JFrame();
		frmCliente.setTitle("Cliente");
		frmCliente.setBounds(100, 100, 526, 466);
		frmCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmCliente.getContentPane().add(panel, BorderLayout.SOUTH);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(textField);
		textField.setColumns(20);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensagem = textField.getText();
				saida.println(mensagem);
				saida.flush();
				textArea.append("Cliente: " + mensagem + "\n");
			}
		});
		panel.add(btnEnviar);
		
		JScrollPane scrollPane = new JScrollPane();
		frmCliente.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
		scrollPane.setViewportView(textArea);
		
		
		
		try {
			
			cliente = new Socket("127.0.0.1", 82);
			saida = new PrintWriter(cliente.getOutputStream());
			entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));

			Thread receptor = new Thread(new Runnable() {
				public void run() {
					try {
						String mensagem = entrada.readLine();
						while (mensagem != null) {
							textArea.append("Servidor: " + mensagem + "\n");
							mensagem = entrada.readLine();
						}

						textArea.append("Servidor offline.\n");
						saida.close();
						cliente.close();

					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			});

			receptor.start();

			textArea.append("Cliente online.\n ------------------- \n");

		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
