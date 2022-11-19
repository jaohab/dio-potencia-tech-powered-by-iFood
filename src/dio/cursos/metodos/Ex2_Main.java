/*
 * Criação de uma aplicação que calcula a área dos 3 quadriláteros notáveis:
 * Quadrado, retângulo e trapézio.
 * 
 * Obs.: Use sobrecarga.
 */

package dio.cursos.metodos;

public class Ex2_Main {

    public static void main(String[] args) {
        
        //Quadriláteros

        //Quadrado
        Ex2_quadrilateros.area(3);

        //Retângulo
        Ex2_quadrilateros.area(5d,5d);

        //Trapézio
        Ex2_quadrilateros.area(7,4,9);

        //Losango
        Ex2_quadrilateros.area(5f,5f);
        
    }

}