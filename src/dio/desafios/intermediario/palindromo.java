/*
 * Desafio
 * 
 * Neste desafio você deverá construir uma função que recebe uma String e identifique se a mesma é um palíndromo, ou seja, se a String é igual a ela mesma invertida. 
 * Dado que temos a String "digital" uma vez invertida temos "latigid" que são diferentes. 
 * Logo, NÃO é um Palíndromo. 
 * Já se recebemos a string "radar" uma vez invertida temos "radar" que são iguais.
 */

package dio.desafios.intermediario;

import java.util.Scanner;

public class palindromo {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        // Retorne TRUE ou FALSE, caso a "palavra" seja ou não um Palíndromo.

        sc.close();

        // Variável que vai receber a palavra ao contrário.
        String contrario = "";

        //Escrever a palavra ao contrário.
        for (int i = (palavra.length()-1); i>=0; i-- ) {
            contrario += palavra.charAt(i);  
        }

        // Comparar as 2 palavras.
        if (palavra.equals(contrario)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

    }
    
}