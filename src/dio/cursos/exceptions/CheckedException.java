package dio.cursos.exceptions;

import java.io.*;
import javax.swing.*;

public class CheckedException {

    public static void main(String[] args) {

        String nomeDoArquivo = "src/dio/cursos/exceptions/file/romances-blake-crouch.txt";

        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado.\n" + e.getMessage() + "\n" + e.getCause());
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado. Entre em contato com o suporte.\n" + e.getMessage() + "\n" + e.getCause());
            e.printStackTrace();
        } 

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    private static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {

        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while (line != null);
        bw.flush();
        br.close();
    }

    
    
}
