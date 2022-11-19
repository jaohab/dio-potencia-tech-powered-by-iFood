/*
 * Desafio
 * 
 * Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0. 
 * 
 * Entrada
 * 
 * A Entrada será composta por um número inteiro, N. 
 * 
 * Saída
 * 
 * Será  impresso o somatório de N até 0, como no exemplo a baixo:
 */

package dio.desafios.basico;

import java.util.*;

public class chamadaRecursiva {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        // Imprima o somatório de N (utilize o método "somatorio").
        
        int num = numero.nextInt();
        int res;

        numero.close();
        
        res = somatorio(num);
        
        System.out.println(res);
        
    }

    /*
     * Método útil que calcula o somatório de um número usando recursividade.
     */

    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }

    }

}