package exemplos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CriarPasta {

	public static void main(String[] args) {
		
		
		//PODE DEIXAR ESSE C�DIGO NO PROGRAMA PORQUE SE O ARQUIVO J� EXISTIR ELE N�O � CRIADO NOVAMENTE
		
		File p1 = new File("arquivos"); //Criar arquivo
		p1.mkdir(); //criar diret�rio
		//p1.delete(); //deletar diret�rio
		
		//N�O CRIAR DIRET�RIO MANUALMENTE DENTRO DO SRC
		
		File p2 = new File("arquivos/nomes"); // O / coloca uma pasta dentro da outra
		p2.mkdir();
		
		File a1 = new File("arquivos/nomes/teste.txt");
		
		try {//Se o arquivo j� foi criado ele n�o pode ser modificado, ent�o se usa o try e catch
			a1.createNewFile(); //Criar arquivo
			
			// o segundo � se voc� quer manter o conte�do do arquivo(append)
			FileWriter fw = new FileWriter(a1, false); //FileWriter � uma classe para escrever no arquivo, o primeiro parametro � o arquivo,
			BufferedWriter bw = new BufferedWriter(fw); //ele grava o texto no txt
			
			bw.write("Salve\n");
			
			for (int i = 0; i < 10; i++) {
				bw.write(i);
			}
			for (int i = 0; i < 10; i++) {
				bw.write(String.valueOf(i)); //precisa converter os n�meros em string
			}
			for (int i = 0; i < 10; i++) {
				bw.write(i+"");//funciona tamb�m
			}
			
			
			bw.close();//precisa fechar os dois porque se n�o fechar o arquivo N�O SALVA;
			fw.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
	}
}
