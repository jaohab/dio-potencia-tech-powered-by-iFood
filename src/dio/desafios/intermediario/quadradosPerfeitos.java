/*
 * Desafio  
 * 
 * Dado um inteiro n, retorne o menor número de números quadrados perfeitos cuja soma seja n. 
 * Um quadrado perfeito é um inteiro que é o quadrado de um inteiro; em outras palavras, é o produto de algum inteiro consigo mesmo. 
 * Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos, enquanto 3 e 11 não são.
 */

package dio.desafios.intermediario;

import java.util.*;

public class quadradosPerfeitos {

    public static void main(String[] args) {

        //int n = Integer.parseInt(new Scanner(System.in).nextLine());
        Scanner sc = new Scanner(System.in);
        //int n = Integer.parseInt(sc.nextLine());

        sc.close();
        int n = 12;

        int[] d = new int[n + 1];

        // Com base no valor total, retorne o menor número de quadrados perfeitos.

        // Valor recebido.
        System.out.println("Valor recebido: " + n);

        int count = 0;
        double res, mod;

        for (int i = n; i >= 1; i--) {
            res = 0;
            // Raiz quadrada.
            res = Math.sqrt((i));

            // Verificar se é um inteiro.
            res = res * 10;
            mod = res % 10;
            if (mod == 0) {
                d[count] = i;
                count++;
            }
        }

        // Valor guardado na array.
        System.out.println("Valores na array: " + Arrays.toString(d));

        // Processo de contagem de quadrados. 1º metodo.
        int x = 0;
        int sub1 = n;
        int countX = 0;

        while (true) {

            if (sub1-d[x] >= 0) {
                sub1 = sub1-d[x];
                countX++;
            } else {
                x++;
            }
            if (sub1 == 0) break;
            
        }
        System.out.println("1º metodo: " + countX);

        // Processo de contagem de quadrados. 2º metodo.
        int y = 1;
        int sub2 = n;
        int countY = 0;
        
        while (true) {

            if (sub2-d[y] >= 0) {
                sub2 = sub2-d[y];
                countY++;
            } else {
                y++;
            }
            if (sub2 == 0) break;
            
        }
        System.out.println("2º metodo: " + countY);

        if (x <= y) {
            System.out.println("Menor valor: " + countX);
        } else {
            System.out.println("Menor valor: " + countY);
        }

    }

}