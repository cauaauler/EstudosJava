package exercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class Exer01 {
	public static void main(String[] args) {
	
		File f1 = new File("exer01/exer01.txt");
		File resposta = new File("exer01/exer01resposta.txt");

		try {
			resposta.createNewFile();
			
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter(resposta, false);
			BufferedWriter bw = new BufferedWriter(fw);
			
			int soma = 0;
			//Ler o arquivo
			String linha = null;
			while((linha = br.readLine()) != null ) {
				String[] linhaArray = linha.split(" ");
				for (int j = 0; j < linhaArray.length; j++) {
					soma += Integer.parseInt(linhaArray[j]);
				}
				//Escrever no arquivo
				bw.write(String.valueOf(soma) + "\n");
					soma = 0;
			}if(linha == null) {
				bw.write("#");
			}
			
			
			br.close();
			fr.close();
			
			bw.close();
			fw.close();
			
		} catch (Exception e) {
			
		}
		
	}

}
