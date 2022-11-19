/*
 * Desafio
 * 
 * Nesse desafio, dados dois números, verifique se eles são iguais. 
 * Caso sejam, retorne "Sao iguais!”. 
 * Caso contrário, retorne "Nao sao iguais!” sem as aspas. 
 * 
 * Entrada
 * 
 * As entradas serão dois valores, um em cada linha, representados por A e B, que sempre serão números inteiros. 
 * 
 * Saída
 * 
 * A saída deverá retornar a frase "Sao iguais!" caso A e B sejam o mesmo valor. 
 * Caso contrário, retorne "Nao sao iguais!", sem as aspas.
 */

package dio.desafios.basico;

import java.util.*;

public class numerosIguais {

    public static void main(String[] args) {
      
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        
        // Imprima se os valores numéricos passados são iguais ou não.

        leitor.close();
          
         if (a == b) {
            System.out.println("Sao iguais!");
        } else {
            System.out.println("Nao sao iguais!");
        }

    }

}