package dio.cursos.collections.maps;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * Dada a população estimada de alguns estados do NE brasileiro, faça:
 * 
 * Estado = PE - População = 9.616.621
 * Estado = AL - População = 3.351.543
 * Estado = CE - População = 9.187.103
 * Estado = RN - População = 3.534.265
 */

public class ExMaps01 {

    public static void main(String[] args) {

        // Crie um dicionário e relacione os estados e suas populações;
        Map<String, Integer> estadosNordeste = new LinkedHashMap<>();
        estadosNordeste.put("PE", 9616621);
        estadosNordeste.put("AL", 3351543);
        estadosNordeste.put("CE", 9187103);
        estadosNordeste.put("RN", 3534265);
        System.out.println(estadosNordeste);


        // Substitua a população do estado do RN por 3.534.165;
        estadosNordeste.put("RN", 3534165);
        System.out.println(estadosNordeste);


        // Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
        if(!estadosNordeste.containsKey("PB")) estadosNordeste.put("PB", 4039277);
        System.out.println(estadosNordeste);
        

        // Exiba a população PE;
        System.out.println(estadosNordeste.get("PE"));


        // Exiba todos os estados e suas populações na ordem que foi informado
        System.out.println(estadosNordeste);


        // Exiba os estados e suas populações em ordem alfabética
        Map<String, Integer> estadosNordesteTree = new TreeMap<>(estadosNordeste);
        System.out.println(estadosNordesteTree);


        // Exiba o estado com o menor população e sua quantidade
        Integer menorPopulacao = Collections.min(estadosNordeste.values());
        for (String estado : estadosNordeste.keySet()) {
            if (estadosNordeste.get(estado) == menorPopulacao) System.out.println(estado + " = " + estadosNordeste.get(estado));
        }


        // Exiba o estado com a maior população e sua quantidade
        Integer maiorPopulacao = Collections.max(estadosNordeste.values());
        for (String estado : estadosNordeste.keySet()) {
            if (estadosNordeste.get(estado) == maiorPopulacao) System.out.println(estado + " = " + estadosNordeste.get(estado));
        }


        // Exiba a soma da população desses estados
        int soma = 0;
        for (int populcao : estadosNordeste.values()) soma += populcao;
        System.out.println(soma);


        // Exiba a média da população deste dicionário de estados
        System.out.println(soma / estadosNordeste.size());


        // Remova os estados com a população menor que 4.000.000
        Iterator<Integer> i = estadosNordeste.values().iterator();
        while (i.hasNext()) {
            if(i.next() < 4000000) i.remove();
        }
        System.out.println(estadosNordeste);


        // Apague o dicionário de estados
        estadosNordeste.clear();
        System.out.println(estadosNordeste);


        // Confira se o dicionário está vazio
        System.out.println(estadosNordeste.isEmpty());


    }
    
}