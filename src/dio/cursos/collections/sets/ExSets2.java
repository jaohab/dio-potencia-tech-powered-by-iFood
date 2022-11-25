package dio.cursos.collections.sets;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e ide. 
 * Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
 * 
 * 1 - Ordem de Inserção
 * 2 - Ordem Natural (nome)
 * 3 - IDE
 * 4 - Ano de criação e nome
 * 5 - Nome, ano de criacao e IDE
 * 
 * Ao final, exiba as linguagens no console, um abaixo da outra.
 */

public class ExSets2 {

    public static void main(String[] args) {

        Set<LinguagemFavorita> linguagem = new LinkedHashSet<>();
        linguagem.add(new LinguagemFavorita("Java", 1991, "IntelliJ"));
        linguagem.add(new LinguagemFavorita("Game Maker Language", 1999, "GameMaker Studio"));
        linguagem.add(new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"));
        linguagem.add(new LinguagemFavorita("Python", 1991, "PyCharm"));
        linguagem.add(new LinguagemFavorita("C#", 1999, "Visual Studio"));


        // 1 - Ordem de Inserção
        System.out.println("\n1 - Ordem de Inserção: ");
        for (LinguagemFavorita linha : linguagem) System.out.println(linha);


        // 2 - Ordem Natural (nome)
        System.out.println("\n2 - Ordem Natural (nome): ");
        Set<LinguagemFavorita> linguagemNome = new TreeSet<>(new compareNome());
        linguagemNome.addAll(linguagem);
        for (LinguagemFavorita linha : linguagemNome) System.out.println(linha);


        // 3 - IDE
        System.out.println("\n3 - IDE: ");
        Set<LinguagemFavorita> linguagemIde = new TreeSet<>(new compareIde());
        linguagemIde.addAll(linguagem);
        for (LinguagemFavorita linha : linguagemIde) System.out.println(linha);


        // 4 - Ano de criação e nome
        System.out.println("\n4 - Ano de criação e nome: ");
        Set<LinguagemFavorita> linguagemAnoNome = new TreeSet<>(new compareAnoNome());
        linguagemAnoNome.addAll(linguagem);
        for (LinguagemFavorita linha : linguagemAnoNome) System.out.println(linha);


        // 5 - Nome, ano de criacao e IDE
        System.out.println("\n5 - Nome, ano de criacao e IDE: ");
        Set<LinguagemFavorita> linguagemNomeAnoIde = new TreeSet<>(new compareNomeAnoIde());
        linguagemNomeAnoIde.addAll(linguagem);
        for (LinguagemFavorita linha : linguagemNomeAnoIde) System.out.println(linha);
        
    }
    
}



class LinguagemFavorita {

    private String nome;
    private int anoDeCriacao;
    private String ide;


    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;


    }
    public String getNome() {
        return nome;
    }
    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }
    public String getIde() {
        return ide;
    }


    @Override
    public String toString() {
        return "[Nome=" + nome + ", Ano De Criação=" + anoDeCriacao + ", IDE=" + ide + "]";
    }

}



class compareNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        return o1.getNome().compareTo(o2.getNome());
    }

}



class compareIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        return o1.getIde().compareTo(o2.getIde());
    }

}



class compareAnoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int ano = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
        if (ano != 0) return ano;
        
        return o1.getNome().compareTo(o2.getNome());
    }

}



class compareNomeAnoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int nome = o1.getNome().compareTo(o2.getNome());
        if (nome != 0) return nome;

        int ano = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
        if (ano != 0) return ano;

        return o1.getIde().compareTo(o2.getIde());
    }

}