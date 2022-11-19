/*
 * Criação de uma aplicação que calcula a área dos 3 quadriláteros notáveis:
 * Quadrado, retângulo e trapézio.
 * 
 * Obs.: Use sobrecarga.
 */

package dio.cursos.metodos;

public class Ex2_quadrilateros {

    public static void area(double lado) {
        double area = lado * lado;
        System.out.println("Área do quadrado: " + area);
    }

    public static void area(double lado1, double lado2) {
        double area = lado1 * lado2;
        System.out.println("Área do retângulo: " + area);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        double area =  ((baseMaior + baseMenor) * altura) / 2;
        System.out.println("Área do trapézio: " + area);
    }

    public static void area(float diagonal1, float diagonal2) { 
        double area =  (diagonal1 * diagonal2) / 2;
        System.out.println("Área do losango: " + area);
    }
    
}