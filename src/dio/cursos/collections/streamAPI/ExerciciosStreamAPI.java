package dio.cursos.collections.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {

        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");




        System.out.println("\n\tImprima todos os elementos dessa lista de String: ");
        
        // Classe anônima
        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.print(t);
            }
        });

        // Lambda
        System.out.print("\n");
        numerosAleatorios.forEach(t -> System.out.print(t));

        // Reference Method
        System.out.print("\n");
        numerosAleatorios.forEach(System.out::print);
        



        System.out.println("\n\n\tPegue os 5 primeiros números e coloque dentro de um Set: ");

        numerosAleatorios.stream()
                .limit(5)                           // Limita (determina) quantos elementos serão pegos
                .collect(Collectors.toSet())        // Coleta os elementos e os coloca dentro de um Set
                .forEach(System.out::print);

        // Armazenando em um Set
        System.out.print("\n");
        Set<String> setColetados = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());

        setColetados.forEach(System.out::print);




        System.out.println("\n\n\tTransforme esta lista de String em uma lista de números inteiros: ");
        
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::print);

        // Armazenando em uma List
        System.out.print("\n");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numerosAleatoriosInteger.forEach(System.out::print);




        System.out.println("\n\n\tPegue os números pares e maiores que 2 e coloque em uma lista: ");

        // Classe anônima
        numerosAleatoriosInteger.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                if (i %2 == 0 && i > 2) return true;
                return false;
            }
        } ).collect(Collectors.toList()).forEach(System.out::print);

        // Lambda
        System.out.print("\n");
        numerosAleatoriosInteger.stream()
                .filter(i -> (i %2 == 0 && i > 2))
                .collect(Collectors.toList())
                .forEach(System.out::print);




        System.out.println("\n\n\tMostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::print);




        System.out.println("\n\n\tRemova os valores ímpares: ");
        numerosAleatoriosInteger.removeIf(i -> (i%2 != 0));
        numerosAleatoriosInteger.forEach(System.out::print);




        // =======      ATIVIDADES      =======




        System.out.println("\n\n\tIgnore os 3 primeiros elementos da lista e imprima o restante: ");
        numerosAleatorios.stream()
                .skip(3)        // Descarta N primeiros elementos da lista.
                .forEach(System.out::print);




        System.out.println("\n\n\tRetirando os números repetidos da lista, quantos números ficam? ");
        List<String> numerosAleatoriosUnicos = numerosAleatorios.stream()
                .distinct()     // Retorna apenas os lementos distintos da lista (não repetidos).
                .collect(Collectors.toList());

        Integer count = (int) numerosAleatoriosUnicos.stream()
                .map(Integer::parseInt)
                .count();       // Conta a quatindade de elementos da lista.
        System.out.println(count);




        System.out.println("\n\n\tMostre o menor valor da lista: ");
        // Classe anônima
        numerosAleatorios.stream().map(Integer::parseInt).min(new Comparator<Integer> () {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }})
            .ifPresent(System.out::println);        // Se houver valor presente, faça...

        // Lambda
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .min((o1, o2) -> (o1.compareTo(o2)))
                .ifPresent(System.out::print);




        System.out.println("\n\n\tMostre o maior valor da lista: ");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .max((o1, o2) -> (o1.compareTo(o2)))
                .ifPresent(System.out::print);



    
        System.out.println("\n\n\tPegue apenas os números pares e some: ");
        List<Integer> numerosParesInt = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i %2 == 0))
                .collect(Collectors.toList());
        System.out.println(numerosParesInt);

        Integer soma = numerosParesInt.stream()
                .mapToInt(Integer::intValue)        // intValue = Retorna um valor de Integer como Int
                .sum();                             // Retorna a soma dos elementos
        System.out.print(soma);
                



        System.out.println("\n\n\tMostre a lista na ordem númerica: ");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .sorted()                           // Retorna uma lista organizada de acordo com a ordem natural 
                .forEach(System.out::print);




        System.out.println("\n\n\tAgrupe os valores ímpares múltiplos de 3 ou de 5: ");
        List<Integer> numerosMultiplos = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i%2 != 0))
                .filter(i -> (i%3 == 0 || i%5 == 0))
                .collect(Collectors.toList());
        System.out.print(numerosMultiplos);



    }
    
}
