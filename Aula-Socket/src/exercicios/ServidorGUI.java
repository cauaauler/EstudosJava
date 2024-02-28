package exercicios;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ServidorGUI {

	private JFrame frmServidor;
	private JTextField textField;
	private JTextArea textArea;
	private JButton btnSend;
	private PrintWriter saida;
	private BufferedReader entrada;
	private Socket cliente;
	private ServerSocket servidor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServidorGUI window = new ServidorGUI();
					window.frmServidor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ServidorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmServidor = new JFrame();
		frmServidor.setTitle("Servidor");
		frmServidor.setBounds(100, 100, 502, 468);
		frmServidor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmServidor.getContentPane().add(panel, BorderLayout.SOUTH);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(textField);
		textField.setColumns(20);
		
		btnSend = new JButton("Enviar");
		btnSend.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensagem = textField.getText();
				saida.println(mensagem);
				saida.flush();
				textArea.append("Servidor: " + mensagem + "\n");
			}
		});
		panel.add(btnSend);
		
		JScrollPane scrollPane = new JScrollPane();
		frmServidor.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
		scrollPane.setViewportView(textArea);
		
		try {
			servidor = new ServerSocket(82);
			cliente = servidor.accept();
			saida = new PrintWriter(cliente.getOutputStream());
			entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));

			Thread receptor = new Thread(new Runnable() {
				public void run() {
					try {
						String mensagem = entrada.readLine();
						while (mensagem != null) {
							textArea.append("Cliente: " + mensagem + "\n");
							mensagem = entrada.readLine();
						}

						textArea.append("Cliente offline.\n");

						saida.close();
						cliente.close();
						servidor.close();

					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			});

			receptor.start();
			
			textArea.append("Servidor online.\n ------------------- \n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
