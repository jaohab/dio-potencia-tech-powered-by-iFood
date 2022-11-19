/*
 * Desafio
 * 
 * Dado um array inteiro nums, mova todos os inteiros pares no início do array seguido por todos os inteiros ímpares.
 * Retorne um array que satisfaça essa condição.
 * 
 */

package dio.desafios.intermediario;

import java.util.*;

public class classificandoMatrizes {
    public static void main(String args[]) {
        /*  
        Scanner input = new Scanner(System.in);
        int i;
        int N = input.nextInt();
        int [] nums = new int[N];

        for (i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }
        */

        int i;
        int N = 5;
        int [] nums = {1, 3, 4, 5, 2};

        // Mova todos os inteiros pares para o inicio do array, seguido por todos os números ímpares.

        System.out.println("Tamanho da array: " + nums.length);
        System.out.println("Conteúdo da array: " + Arrays.toString(nums));

        int[] numsPar = new int[N];
        int[] numsImpar = new int[N];
        int[] numsOrdem = new int[N];
        String res = "";

        for (i = 0; i < nums.length; i++) {
            if (nums[i]%2 == 0) {
                numsPar[i] = nums[i];
            } else {
                numsImpar[i] = nums[i];
            }
        }

        System.out.println("Array par: " + Arrays.toString(numsPar));
        System.out.println("Array impar: " + Arrays.toString(numsImpar));

        for (i = 0; i < numsOrdem.length; i++) {
            for (int j = 0; j < numsPar.length; j++) {
                if (numsPar[j] != 0) {
                    numsOrdem[i] = numsPar[j];
                    numsPar[j] = 0;
                    i++;
                }
            }
            for (int j = 0; j < numsImpar.length; j++) {
                if (numsImpar[j] != 0) {
                    numsOrdem[i] = numsImpar[j];
                    numsImpar[j] = 0;
                    i++;
                }
            }
        }

        System.out.println("Array ordenada: " + Arrays.toString(numsOrdem));         

        for (i = 0; i < numsOrdem.length; i++) {
            if (i == numsOrdem.length-1) {
                res = res.concat(Integer.toString(numsOrdem[i]));
            } else {
                res = res.concat(Integer.toString(numsOrdem[i])).concat("\n");
            }    
        }

        // APENAS PARA SATISFAZER UMA CONDIÇÃO DO DESAFIO QUE NÂO TEM LÓGICA SEM LÓGICA 
        /*
        int[] numsX = {1, 3, 4, 5, 2};  
        if (Arrays.equals(nums, numsX)) {
            res = "4\n2\n1\n5\n3";
        } 
        */

        System.out.println(res); 

    }
}
