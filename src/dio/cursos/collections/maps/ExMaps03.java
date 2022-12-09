package dio.cursos.collections.maps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
 * Dadas as seguintes informações  de id e contato, crie um dicionário e ordene este dicionário exibindo (Nome id - Nome contato);
 * 
 * id = 1 - Contato = nome: Simba, número: 2222;
 * id = 4 - Contato = nome: Cami, número: 5555;
 * id = 3 - Contato = nome: Jon, número: 1111;
*/

public class ExMaps03 {

    public static void main(String[] args) {

        Map<Integer, Agenda> minhaAgenda = new LinkedHashMap<>();
        minhaAgenda.put(1, new Agenda("Simba", 2222));
        minhaAgenda.put(4, new Agenda("Cami", 5555));
        minhaAgenda.put(3, new Agenda("Jon", 1111));


        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Agenda> minhaAgendaAleatorio = new HashMap<>(minhaAgenda);
        //System.out.println(minhaAgendaAleatorio);
        for (Entry<Integer, Agenda> entry : minhaAgendaAleatorio.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + " - " + entry.getValue().getNumero());
        }



        System.out.println("--\tOrdem Inserção\t--");
        //System.out.println(minhaAgenda);
        for (Entry<Integer, Agenda> entry : minhaAgenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + " - " + entry.getValue().getNumero());
        }



        System.out.println("--\tOrdem id\t--");
        Map<Integer, Agenda> minhaAgendaTree = new TreeMap<>(minhaAgenda);
        //System.out.println(minhaAgendaTree);
        for (Entry<Integer, Agenda> entry : minhaAgendaTree.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + " - " + entry.getValue().getNumero());
        }



        System.out.println("--\tOrdem número telefone\t--");
        Set<Map.Entry<Integer, Agenda>> minhaAgendaNumeros = new TreeSet<>(new ComparatorNumeros());
        minhaAgendaNumeros.addAll(minhaAgenda.entrySet());
        //System.out.println(minhaAgendaNumeros);
        for (Entry<Integer, Agenda> entry : minhaAgendaNumeros) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + " - " + entry.getValue().getNome());
        }



        System.out.println("--\tOrdem nome contato\t--");
        Set<Map.Entry<Integer, Agenda>> minhaAgendaNomes = new TreeSet<>(new ComparatorNomes());
        minhaAgendaNomes.addAll(minhaAgenda.entrySet());
        //System.out.println(minhaAgendaNomes);
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