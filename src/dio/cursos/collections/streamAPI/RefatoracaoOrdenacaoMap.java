package dio.cursos.collections.streamAPI;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.function.Function;

public class RefatoracaoOrdenacaoMap {
    
    public static void main(String[] args) {

        Map<Integer, Agenda> minhaAgenda = new LinkedHashMap<>();
        minhaAgenda.put(1, new Agenda("Simba", 2222));
        minhaAgenda.put(4, new Agenda("Cami", 5555));
        minhaAgenda.put(3, new Agenda("Jon", 1111));
        minhaAgenda.put(7, new Agenda("Paula", 3333));
        minhaAgenda.put(2, new Agenda("Carla", 7777));
        minhaAgenda.put(5, new Agenda("Mario", 4444));
        minhaAgenda.put(8, new Agenda("Luis", 6666));


        System.out.println("--\tOrdem número telefone\t--");


        //    ======    Classe Comparator    ======

        
        Set<Map.Entry<Integer, Agenda>> minhaAgendaNumeros1 = new TreeSet<>(new ComparatorNumeros());

        // A classe tem que estar fora do método Main, a classe junto apenas para questões de exemplificação.
        /*
        class ComparatorNumeros implements Comparator<Map.Entry<Integer, Agenda>> {
            @Override
            public int compare(Entry<Integer, Agenda> o1, Entry<Integer, Agenda> o2) {
                return o1.getValue().getNumero().compareTo(o2.getValue().getNumero());
            }
        }
        */
        minhaAgendaNumeros1.clear();
        

        //    ======    Classe Anônima    ======


        Set<Map.Entry<Integer, Agenda>> minhaAgendaNumeros2 = new TreeSet<>(new Comparator<Map.Entry<Integer, Agenda>>() {
            @Override
            public int compare(Map.Entry<Integer, Agenda> o1, Map.Entry<Integer, Agenda> o2) {
                return o1.getValue().getNumero().compareTo(o2.getValue().getNumero());
            }
        });
        minhaAgendaNumeros2.clear();
        

        //    ======    Function interface    ======

        
        Set<Map.Entry<Integer, Agenda>> minhaAgendaNumeros3 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Agenda>, Integer>() {
                @Override
                public Integer apply(Entry<Integer, Agenda> t) {
                    return t.getValue().getNumero();
                }
        }));
        minhaAgendaNumeros3.clear();
        

        //    ======    Lambda    ======


        Set<Map.Entry<Integer, Agenda>> minhaAgendaNumeros4 = new TreeSet<>(Comparator.comparing(numero -> numero.getValue().getNumero()));


        minhaAgendaNumeros4.addAll(minhaAgenda.entrySet());
        for (Entry<Integer, Agenda> entry : minhaAgendaNumeros4) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + " - " + entry.getValue().getNome());            
        }



        System.out.println("--\tOrdem nome contato\t--");
        
        Set<Map.Entry<Integer, Agenda>> minhaAgendaNomes = new TreeSet<>(Comparator.comparing(nome -> nome.getValue().getNome()));

        minhaAgendaNomes.addAll(minhaAgenda.entrySet());
        for (Entry<Integer, Agenda> entry : minhaAgendaNomes) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + " - " + entry.getValue().getNumero());            
        }

    }
    
}


class Agenda {

    private String nome;
    private Integer numero;

    public Agenda(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "[nome = " + nome + ", numero = " + numero + "]";
    }

}



class ComparatorNomes implements Comparator<Map.Entry<Integer, Agenda>> {

    @Override
    public int compare(Entry<Integer, Agenda> o1, Entry<Integer, Agenda> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }

}



class ComparatorNumeros implements Comparator<Map.Entry<Integer, Agenda>> {
    @Override
    public int compare(Entry<Integer, Agenda> o1, Entry<Integer, Agenda> o2) {
        return o1.getValue().getNumero().compareTo(o2.getValue().getNumero());
    }
}
