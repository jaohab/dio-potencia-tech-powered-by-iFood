package dio.cursos.collections.sets;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Dados as seguintes informações sobre minhas séries favoritas, crie um conjunto e ordene esta conjunto exibindo:
 * (nome - gênero - tempo de episódio)
 * 
 * Série 1 = Nome: got, gênero: fantasia, tempo de episódio: 60
 * Série 2 = Nome: dark, gênero: drama, tempo de episódio: 60
 * Série 3 = Nome: that '70s show, gênero: comédia, tempo de episódio: 25
 */

public class ExemploOrdenacaoSets {

    public static void main(String[] args) {

        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
            add(new Serie("breaking bad", "drama", 50));
            add(new Serie("arcane", "animação", 30));
        }};


        System.out.println("\n---\tOrdem aleatória\t---");
        for (Serie serie : minhasSeries) System.out.println(serie);


        System.out.println("\n---\tOrdem de Inserção\t---");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
            add(new Serie("breaking bad", "drama", 50));
            add(new Serie("arcane", "animação", 25));
        }};
        for (Serie serie : minhasSeries1) System.out.println(serie);


        System.out.println("\n---\tOrdem Natural (Tempo Episódio)\t---");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2) System.out.println(serie);


        System.out.println("\n---\tOrdem Nome / Gênero / Tempo Episódio \t---");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie : minhasSeries3) System.out.println(serie);


        // Atividade
        System.out.println("\n---\tOrdem Gênero\t---");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie : minhasSeries4) System.out.println(serie);


        System.out.println("\n---\tOrdem Nome\t---");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorNome());
        minhasSeries5.addAll(minhasSeries);
        for (Serie serie : minhasSeries5) System.out.println(serie);
        
    }
    
}


class Serie implements Comparable <Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public String getNome() {
        return nome;
    }
    public String getGenero() {
        return genero;
    }
    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((tempoEpisodio == null) ? 0 : tempoEpisodio.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Serie other = (Serie) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (tempoEpisodio == null) {
            if (other.tempoEpisodio != null)
                return false;
        } else if (!tempoEpisodio.equals(other.tempoEpisodio))
            return false;
        return true;
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;

        return this.getGenero().compareTo(serie.getGenero());
     
    }

}


class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }

}


class ComparatorGenero implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;
        
        return s1.getNome().compareTo(s2.getNome());
    }

}

class ComparatorNome implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        return s1.getNome().compareTo(s2.getNome());
    }

}
