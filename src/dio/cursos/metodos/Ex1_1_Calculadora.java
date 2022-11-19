/*
 * Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão.
 * Sempre 2 devem ser passados. 
 */

package dio.cursos.metodos;

import java.util.Scanner;

public class Ex1_1_Calculadora {

    public static String iniciar(Scanner scan) {
        
        System.out.println("Qual operação você deseja realizar:");
        System.out.println(" 1 = Somar\n 2 = Subtrair\n 3 = Multiplicar\n 4 = Dividir");
        System.out.print("Resposta: ");
        
        return scan.next();
    }

    public static double somar(double x, double y) {
        return x+y;
    }

    public static double subtrair(double x, double y) {
        return x-y;
    }

    public static double multiplicar(double x, double y) {
        return x*y;
    }

    public static double dividir(double x, double y) {
        return x/y;
    }

}