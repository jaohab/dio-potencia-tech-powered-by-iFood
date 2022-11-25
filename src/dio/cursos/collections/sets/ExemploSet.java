package dio.cursos.collections.sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

    public static void main(String[] args) {
        
        // Dada uma lista com 7 notas de um aluno (7, 8.5, 9.3, 5, 7, 0, 3.6), faça:

        
        // Set notas = new HashSet();                                   //Antes do Java 5 

        // Set<Double> notas = new HashSet<>();                         //Generics (jdk 5) - Diamond Operator (jdk 7)

        // HashSet<Double> notas = new HashSet<>();

        // Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        /*
        Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);      //Lista imutável
        notas.add(10d);
        notas.remove(5d);
        System.out.println(notas);
        */


        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        //Não permite elementos repetidos.

        //Impossível trabalhar composições (INDEX) usando o método Set.


        System.out.println("\nConfira se a nota 5.0 está na lista: " + notas.contains(5d));


        System.out.println("\nExiba a menor nota: " + Collections.min(notas));


        System.out.println("\nExiba a maior nota: " + Collections.max(notas));


        System.out.print("\nExiba a soma dos valores: ");
        Iterator<Double> i = notas.iterator();
        double soma = 0d;
        while (i.hasNext()) {
            double next = i.next();
            soma += next;          
        }
        System.out.println(soma);


        System.out.println("\nExiba a média das notas: " + (soma/notas.size()));


        System.out.println("\nRemova da lista a nota 0: ");
        System.out.println(notas);
        notas.remove(0d);
        System.out.println(notas);


        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> i1 = notas.iterator();
        while(i1.hasNext()) {
            Double next = i1.next();
            if (next < 7) i1.remove();
        }
        System.out.println(notas);


        System.out.println("\nExiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);


        System.out.println("\nExiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);


        System.out.println("\nApague toda o conjunto: ");
        System.out.println("Antes: " + notas);
        notas.clear();
        System.out.println("Depois: " + notas);


        System.out.println("\nConfira se o conjunto está vazia: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazia: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazia: " + notas3.isEmpty());

    }
    
}
