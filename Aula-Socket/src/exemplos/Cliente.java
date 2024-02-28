package exemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		try {
			
			Socket cliente = new Socket("127.0.0.1", 82);
			PrintWriter saida = new PrintWriter(cliente.getOutputStream());
			BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			Scanner leitor = new Scanner(System.in);

			Thread remetente = new Thread(new Runnable() {
				public void run() {
					while (true) {
						String mensagem = leitor.nextLine();
						saida.println(mensagem);
						saida.flush();
					}
				}
			});

			remetente.start();

			Thread receptor = new Thread(new Runnable() {
				public void run() {
					try {
						String mensagem = entrada.readLine();
						while (mensagem != null) {
							System.out.println("Servidor: " + mensagem);
							mensagem = entrada.readLine();
						}

						System.out.println("Servidor offline.");
						saida.close();
						cliente.close();

					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			});

			receptor.start();

			System.out.println("Cliente online.");

		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}