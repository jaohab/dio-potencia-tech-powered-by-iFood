/*
 * Desafio
 * 
 * Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.
 * 
 * Entrada
 * 
 * A entrada deverá ser composta pelo valor A na primeira linha, seguido do valor N na segunda. 
 * 
 * Saída
 * 
 * A saída deverá retornar o valor da soma de todos os múltiplos A até o seu limite N.
 */

package dio.desafios.basico;

import java.util.Scanner;

public class somandoMultiplos {
    
    public static void main(String[] args) {
        int A, N, res;
        int soma = 0;
        int A1 = 0;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
        
        // Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".

        input.close();

        for (int i=0; A1 < N; i++) {
            res = (A * i);
            A1 = (A * i);
            soma = (soma + res);
        }
        
        System.out.println(soma);
        
    }

}