package dio.cursos.collections.sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Crie um conjunto contendo as cores do arco-íris e:
 * 
 * 1 - Exiba todas as cores uma abaixo da outra
 * 2 - A quantidade de cores que o arco-íris tem
 * 3 - Exiba as cores em ordem alfabética
 * 4 - Exiba as cores na ordem inversa da que foi informada
 * 5 - Exiba todas as cores que começam com a letra ”v”
 * 6 - Remova todas as cores que não começam com a letra “v”
 * 7 - Limpe o conjunto
 * 8 - Confira se o conjunto está vazio
 */

 // vermelha, laranja, amarela, verde, azul, azul-escuro e violeta

public class ExSets01 {
    
    public static void main(String[] args) {
        
        // Criando o conjunto e inserindo os elementos
        Set<String> arcoIris = new HashSet<>();
        arcoIris.add("vermelha");
        arcoIris.add("laranja");
        arcoIris.add("amarela");
        arcoIris.add("verde");
        arcoIris.add("azul");
        arcoIris.add("azul-escuro");
        arcoIris.add("violeta");


        // 1 - Exiba todas as cores uma abaixo da outra
        System.out.println("\n1 - Exiba todas as cores uma abaixo da outra: ");
        for (String cor : arcoIris) System.out.println(cor);


        // 2 - A quantidade de cores que o arco-íris tem
        System.out.println("\n2 - A quantidade de cores que o arco-íris tem: ");
        System.out.println(arcoIris.size());


        // 3 - Exiba as cores em ordem alfabética
        System.out.println("\n3 - Exiba as cores em ordem alfabética: ");
        Set<String> arcoIrisTree = new TreeSet<>();
        arcoIrisTree.addAll(arcoIris);
        for (String cor : arcoIrisTree) System.out.println(cor);


        // 4 - Exiba as cores na ordem inversa da que foi informada
        System.out.println("\n4 - Exiba as cores na ordem inversa da que foi informada: ");
        Set<String> arcoIrisInverso = ((TreeSet<String>) arcoIrisTree).descendingSet();
        for (String cor : arcoIrisInverso) System.out.println(cor);


        // 5 - Exiba todas as cores que começam com a letra 'v'
        System.out.println("\n5 - Exiba todas as cores que começam com a letra 'v': ");
        for (String cor : arcoIrisTree) {
            char primeiraLetra = cor.charAt(0);
            if (primeiraLetra == 'v') System.out.println(cor);
        }


        // 6 - Remova todas as cores que não começam com a letra 'v'
        System.out.println("\n6 - Remova todas as cores que não começam com a letra 'v': ");
        Set<String> arcoIrisDel = new TreeSet<>();
        arcoIrisDel.addAll(arcoIris);
        System.out.println(arcoIrisDel);
        for (String cor : arcoIrisTree) {
            char primeiraLetra = cor.charAt(0);
            if (primeiraLetra != 'v') arcoIrisDel.remove(cor);
        }
        System.out.println(arcoIrisDel);


        // 7 - Limpe o conjunto
        System.out.println("\n7 - Limpe o conjunto ");
        arcoIrisDel.clear();
        System.out.println(arcoIrisDel);


        // 8 - Confira se o conjunto está vazio
        System.out.println("\n8 - Confira se o conjunto está vazio: ");
        System.out.println("Conjunto 'arcoIrisDel' esta vazio? \t" + arcoIrisDel.isEmpty());
        System.out.println("Conjunto 'arcoIris' esta vazio? \t" + arcoIris.isEmpty());
        System.out.println("Conjunto 'arcoIrisTree' esta vazio? \t" + arcoIrisTree.isEmpty());
        System.out.println("Conjunto 'arcoIrisInverso' esta vazio? \t" + arcoIrisInverso.isEmpty());



    }

}