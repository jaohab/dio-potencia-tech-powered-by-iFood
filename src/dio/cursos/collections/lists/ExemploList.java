package dio.cursos.collections.lists;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class ExemploList {

    public static void main(String[] args) {
        
        // List notas = new ArrayList<>();                                      //Antes do Java 5 

        // List<Double> notas = new ArrayList<>();                              //Generics (jdk 5) - Diamond Operator (jdk 7)

        // ArrayList<Double> notas = new ArrayList<>();

        // List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        // List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);   //Limitado, não suporta adicionar novos elementos
        // notas.add(10d);
        // System.out.println(notas);

        // List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);            //Lista imutável
        // notas.add(10d);
        // notas.remove(5d);
        // System.out.println(notas);


        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();  
        System.out.println(notas);   
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(0d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas);
        System.out.println(notas.toString());


        System.out.println("\nExiba a posição da nota 5.0: " + notas.indexOf(5d));


        System.out.println("\nAdicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);


        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);


        System.out.println("\nConfira se a nota 5.0 está na lista: " + notas.contains(5d));


        System.out.println("\nExiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) {
            System.out.println(nota);
        }


        System.out.println("\nExiba a terceira nota adicionada: " + notas.get(2));


        System.out.println("\nExiba a menor nota: " + Collections.min(notas));


        System.out.println("\nExiba a maior nota: " + Collections.max(notas));


        System.out.print("\nExiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);


        System.out.println("\nExiba a média das notas: " + (soma/notas.size()));


        System.out.println("\nRemova da lista a nota 0: ");
        System.out.println(notas);
        notas.remove(0d);
        System.out.println(notas);


        System.out.println("\nRemova a nota da posição 0: ");
        System.out.println(notas);
        notas.remove(0);
        System.out.println(notas);


        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);


        System.out.println("\nApague toda a lista: ");
        notas.clear();
        System.out.println(notas);


        System.out.println("\nConfira se a lista está vazia: " + notas.isEmpty());


        System.out.println("\n");


        /*
         * Resolva esses exercícios utilizando os métodos da implementação LinkedList:
         * 
         * Crie uma lista chamada notas2 e coloque todos os elementos da List ArrayList nessa nova lista.
         * Mostre a primeira nota da nova lista sem removê-lo.
         * Mostre a primeira nota da nova lista removendo-o.
         */

        // Adicionando valores a ArrayList
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(0d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println("ArrayList:  " + notas);

        // Criando a LinkedList
        List<Double> notas2 = new LinkedList<>();
        System.out.println("LinkedList: " + notas2);

        // Transferindo o conteúdo da ArrayList para a LinkedList
        for (Double x : notas) {
            notas2.add(x);
        }
        System.out.println("LinkedList: " + notas2);

        // Primeira nota da nova lista sem removê-lo.
        System.out.println("Primeira nota da LinkedList: " + notas2.get(0));

        // Primeira nota da nova lista sem removê-lo.
        System.out.println("Remover a primeira nota da LinkedList: " + notas2.remove(0));
        System.out.println("LinkedList: " + notas2);

        
    }

}