package exercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exer02 {

    public static void main(String[] args) {
        int maxHoras = 24;
        int totalHoras = 0;

        File f1 = new File("exer02/exer02.txt");
        File resposta = new File("exer02/exer02resposta.txt");

        try {
            f1.createNewFile();
            resposta.createNewFile();

            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter(resposta, false);
            BufferedWriter bw = new BufferedWriter(fw);

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] linhaArray = linha.split(" ");
                for (int i = 0; i < linhaArray.length -1; i++) { 
                    int a1 = Integer.parseInt(linhaArray[i]);
                    int a2 = Integer.parseInt(linhaArray[i + 1]);

                    if (a1 > a2) {
                        totalHoras = maxHoras - a1 + a2;
                    } else if (a2 > a1) {
                        totalHoras = a2 - a1;
                    } else {
                        totalHoras = maxHoras;
                    }
                    bw.write("O EVENTO DUROU " + totalHoras + " HORA(S)" + "\n");
                }
            }

            bw.close();
            fw.close();

            br.close();
            fr.close();
        } catch (IOException e) {
            
        }
    }
}
