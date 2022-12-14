package dio.cursos.exceptions;

import javax.swing.*;

public class UncheckedException {

    public static void main(String[] args) {
        boolean continuar = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continuar = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro!\n" + e.getMessage());
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada inválida, impossível dividir por 0!\n" + e.getMessage());
            } finally {
                System.out.println("Chegou no finally.");
            }
        } while (continuar);
        System.out.println("o código continua...");
    }

    public static int dividir(int a, int b) {
        return a/b;
    }
    
}