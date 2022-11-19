/*
 * Desafio
 * 
 * O fatorial de um número inteiro positivo N é o produto de todos os inteiros positivos menores ou iguais a n. 
 * Fazemos um fatorial desajeitado usando os inteiros em ordem decrescente, 
 * trocando as operações de multiplicação por uma rotação fixa de operações cuja ordem é: 
 * multiplicar '*', dividir '/', adicionar '+' e subtrair '-'. 
 * 
 * Por exemplo, desajeitado(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1. 
 * 
 * Lembre-se que no fatorial desajeitado as operações ainda são aplicadas usando a ordem usual de operações aritméticas. 
 * Além disso, a divisão neste caso sempre resulta em um número inteiro, por exemplo, 90 / 8 = 11. 
 * Dado um inteiro N, retorne o fatorial desajeitado de n.
 */

package dio.desafios.intermediario;

import java.util.Arrays;

public class fatorialDesejado {

    public static void main(String[] args) {

        //int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int n = 12;
        int res = 0;
        int cnt = 0;
        int[] tmp = new int [n];

        while (n > 0) {

            // Calcule o valor do fatorial de "n", atrinbuindo o retorno a "r".
            
            if (n >= 3 && cnt == 0) {
                tmp[cnt] = ((n*(n-1))/(n-2));
                cnt++;
                n-=3;
            }

            if (n >= 4 && cnt > 0) {
                tmp[cnt] = (n - (((n-1) * (n-2)) / (n-3)));
                cnt++;
                n-=4;
            }

            if (n == 3) {
                tmp[cnt] = (n - ((n-1)*(n-2)));
                cnt++;
                n-=3;
            }

            if (n == 2) {
                tmp[cnt] = n-(n-1);
                cnt++;
                n-=2;
            }

            if (n == 1) {
                tmp[cnt] = n;
                cnt++;
                n--;
                break;
            }

            if (n <= 0) {
                break;
            }
        }

        System.out.println("Array de resultados: " + Arrays.toString(tmp));
                
        for (int i=0; i<tmp.length; i++) {
            res = res + tmp[i];
        }
        
        System.out.println("Resultados: " + res);

    }

}