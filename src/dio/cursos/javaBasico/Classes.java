package dio.cursos.javaBasico;

import javax.swing.*;

public class Classes {
    
    public static void main(String [] args) {

        // Variaveis
        String primeiroNome;
        String segundoNome;
        String nomeCompleto;

        // Processamento
        primeiroNome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        segundoNome = JOptionPane.showInputDialog(null, "Digite seu sobrenome: ");

        nomeCompleto = nomeConpleto (primeiroNome, segundoNome);

        // Exibir
        System.out.println(nomeCompleto);
        JOptionPane.showMessageDialog(null, nomeCompleto);
    }

    // Método
    public static String nomeConpleto (String primeiroNome, String segundoNome) {
        //Concatenar strings
        return primeiroNome.concat(" ").concat(segundoNome);

    }
    
}