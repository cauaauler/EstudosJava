package exemplos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CriarCidade {

	public static void main(String[] args) {
		
		ArrayList<String> informacoes = new ArrayList<String>();
		
		Scanner leitor = new Scanner(System.in);
		
		File cidade1 = new File("arquivos/cidades");
		cidade1.mkdir();
		
		File a1 = new File("arquivos/cidades/info.txt");
		

		for (int i = 0; i < 3; i++) {
			informacoes.add(leitor.nextLine());
		}
		
		
		try {
			a1.createNewFile();
			
			FileWriter fw = new FileWriter(a1, true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (int i = 0; i < informacoes.size(); i++) {
				bw.write(informacoes.get(i));
			}
			
			bw.close();
			fw.close();
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		

	}

}
