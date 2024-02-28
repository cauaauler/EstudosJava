package exercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Provas {

	private JFrame frame;
	private JTextField textFieldDisciplina;
	private JTextField textFieldProf;
	private JTextField textFieldDia;
	private JTextField textFieldHora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Provas window = new Provas();
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
	public Provas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 627, 386);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Disciplina");
		lblNewLabel.setBounds(27, 44, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Professor");
		lblNewLabel_1.setBounds(27, 69, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Dia");
		lblNewLabel_2.setBounds(27, 94, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hor\u00E1rio");
		lblNewLabel_3.setBounds(27, 119, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textFieldDisciplina = new JTextField();
		textFieldDisciplina.setColumns(10);
		textFieldDisciplina.setBounds(105, 41, 231, 20);
		frame.getContentPane().add(textFieldDisciplina);
		
		textFieldProf = new JTextField();
		textFieldProf.setColumns(10);
		textFieldProf.setBounds(105, 66, 231, 20);
		frame.getContentPane().add(textFieldProf);
		
		textFieldDia = new JTextField();
		textFieldDia.setColumns(10);
		textFieldDia.setBounds(105, 91, 231, 20);
		frame.getContentPane().add(textFieldDia);
		
		textFieldHora = new JTextField();
		textFieldHora.setColumns(10);
		textFieldHora.setBounds(105, 116, 231, 20);
		frame.getContentPane().add(textFieldHora);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(351, 24, 250, 263);
		frame.getContentPane().add(textArea);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String disciplina = textFieldDisciplina.getText();
				String professor = textFieldProf.getText();
				String dia = textFieldDia.getText();
				String horario = textFieldHora.getText();
				
				String texto = (disciplina + " (" + professor + ") " + dia + " " + horario );
				
				textArea.setText(textArea.getText() + texto + "\n");
							}
		});
		btnInserir.setBounds(132, 180, 89, 23);
		frame.getContentPane().add(btnInserir);
		
		JButton btnDelete = new JButton("Deletar");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
			}
		});
		btnDelete.setBounds(132, 231, 89, 23);
		frame.getContentPane().add(btnDelete);
	}
}
