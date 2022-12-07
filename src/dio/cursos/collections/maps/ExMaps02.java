package dio.cursos.collections.maps;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Faça um programa que simule um lançamento de dados.
 * Lance o dado 100 vezes e armazene.
 * Depois, mostre quantas vezes cada valor foi inserido.
 */

public class ExMaps02 {

    public static void main(String[] args) {

        Map<Integer, Integer> dado = new LinkedHashMap<>();

        int lancamento = 0;
        for (int i = 1; i <= 100; i++ ){
            lancamento = 1 + (int)(Math.random() * ((6 - 1) + 1));
            dado.put(i, lancamento);
        }

        System.out.println(dado);

        int d1=0, d2=0, d3=0, d4=0, d5=0, d6=0;

        Iterator<Integer> it = dado.values().iterator();
        while (it.hasNext()) {
            int valor = it.next();
            if (valor==1) d1++;
            if (valor==2) d2++;
            if (valor==3) d3++;
            if (valor==4) d4++;
            if (valor==5) d5++;
            if (valor==6) d6++;
        }

        System.out.println("Vezes que o dado caiu na posição 1: " + d1);
        System.out.println("Vezes que o dado caiu na posição 2: " + d2);
        System.out.println("Vezes que o dado caiu na posição 3: " + d3);
        System.out.println("Vezes que o dado caiu na posição 4: " + d4);
        System.out.println("Vezes que o dado caiu na posição 5: " + d5);
        System.out.println("Vezes que o dado caiu na posição 6: " + d6);
        
    }
    
}
