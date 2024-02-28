package exemplos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CriarPasta {

	public static void main(String[] args) {
		
		
		//PODE DEIXAR ESSE CÓDIGO NO PROGRAMA PORQUE SE O ARQUIVO JÁ EXISTIR ELE NÃO É CRIADO NOVAMENTE
		
		File p1 = new File("arquivos"); //Criar arquivo
		p1.mkdir(); //criar diretório
		//p1.delete(); //deletar diretório
		
		//NÃO CRIAR DIRETÓRIO MANUALMENTE DENTRO DO SRC
		
		File p2 = new File("arquivos/nomes"); // O / coloca uma pasta dentro da outra
		p2.mkdir();
		
		File a1 = new File("arquivos/nomes/teste.txt");
		
		try {//Se o arquivo já foi criado ele não pode ser modificado, então se usa o try e catch
			a1.createNewFile(); //Criar arquivo
			
			// o segundo é se você quer manter o conteúdo do arquivo(append)
			FileWriter fw = new FileWriter(a1, false); //FileWriter é uma classe para escrever no arquivo, o primeiro parametro é o arquivo,
			BufferedWriter bw = new BufferedWriter(fw); //ele grava o texto no txt
			
			bw.write("Salve\n");
			
			for (int i = 0; i < 10; i++) {
				bw.write(i);
			}
			for (int i = 0; i < 10; i++) {
				bw.write(String.valueOf(i)); //precisa converter os números em string
			}
			for (int i = 0; i < 10; i++) {
				bw.write(i+"");//funciona também
			}
			
			
			bw.close();//precisa fechar os dois porque se não fechar o arquivo NÃO SALVA;
			fw.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
	}
}
