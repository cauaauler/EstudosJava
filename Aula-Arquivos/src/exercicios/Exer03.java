package exercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;

public class Exer03 {
	public static void main(String[] args) {
		
		File f1 = new File("exer03/exer03.txt");
		File respostas = new File("exer03/exer03respostas.txt");
		int[] qtdLeds = {6,2,5,5,4,5,6,3,7,6}; //quantidade de leds necessários para cada posição do array
		int somaLeds = 0;
		
		try {
			f1.createNewFile();
			respostas.createNewFile();
			
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter(respostas, false);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String linha = null;
			while((linha = br.readLine()) != null) {
				String[] linhas =  linha.split("");
				int numero;
				for (int i = 0; i < linhas.length; i++) {
					numero = Integer.parseInt(linhas[i]);
					somaLeds += qtdLeds[numero]; // procura o número no array qtdLeds
						
				}
				bw.write(somaLeds + "\n");			
			}
			br.close();
			fr.close();
			
			bw.close();
			fw.close();
			
		} catch (Exception e) {
			
		}
	}

}
