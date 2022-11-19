/*
 * Desafio
 * 
 * Neste desafio, você terá que criar uma função que faça um número como argumento e retorne "Fizz", "Buzz" ou "FizzBuzz". 
 * 
 * Entrada
 * 
 * Você receberá um número onde: 
 * Se o número for um múltiplo de 3 e 5 -> "FizzBuzz"; 
 * Se o número for apenas múltiplo de 3 -> "Fizz"; 
 * Se o número for apenas múltiplo de 5 -> "Buzz"; 
 * Se o número não for um múltiplo de 3 ou 5, o número deve ser exibido; 
 * 
 * Saída
 * 
 * Retorne a palavra correta de acordo com o seu múltiplo. 
 * Caso o valor não seja múltiplo de 3 ou 5, exiba o número.
 */

package dio.desafios.basico;

import java.util.*;

public class fizzBuzz {
    
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int num = number.nextInt();
        
        number.close();

        int mod1, mod2;
        String res = "";

        // Retorne a palavra correta de acordo com o múltiplo de "num". 
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.
        
        mod1 = num % 3;
        mod2 = num % 5;
        
        if (mod1 == 0){
            res = "Fizz";
        }
        
        if (mod2 == 0){
            res = res + "Buzz";
        }
        
        if (mod1 != 0 && mod2 != 0 ){
            res = Integer.toString(num);
        }

        System.out.println(res);
        
    }

}