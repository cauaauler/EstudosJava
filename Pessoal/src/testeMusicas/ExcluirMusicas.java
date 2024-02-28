package testeMusicas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ExcluirMusicas {

	public static void main(String[] args) {
		
		File pastaExcluir = new File("C:\\Users\\cauaa\\Desktop\\Excluir"); //QUANDO BAIXAR AS MÚSICAS DENOVO É SÓ MUDAR ISSO AQUI
		
		File MusicasExcluir[] = pastaExcluir.listFiles();
		
		for (int i = 0; i < MusicasExcluir.length; i++) {
			String musica = MusicasExcluir[i].getName();
			
			
			File pasta = new File("ftp://pc@192.168.2.104:5352/device/snaptube/download/SnapTube Audio/" + musica);
			
			System.out.println(pasta);
			try {
				pasta.delete();
			
		
				
				
				
			} catch (Exception e) {
				
			}

		}
		
		
		
	}

}
