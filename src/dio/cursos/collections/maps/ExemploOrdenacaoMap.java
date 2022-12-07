package dio.cursos.collections.maps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * Dados as seguintes informações sobre meus livros favoritos e seus autores, crie um dicionário e ordene este dicionário:
 * exibindo (Nome Autor - Nome Livro);
 * 
 * Autor = Hawking, Stephen     - Livro = Uma Breve História do Tempo.  - Páginas = 256
 * Autor = Duhigg, Charles      - Livro = O Poder do Hábito.            - Páginas = 408
 * Autor = Harari, Yuval Noah   - Livro = 21 Lições Para o Século 21.   - Páginas = 432
 */

public class ExemploOrdenacaoMap {

    public static void main(String[] args) {

        System.out.println("\n---\tOrdem aleatória\t---");
        Map<String, Livro> meusLivros = new HashMap<>();
        meusLivros.put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
        meusLivros.put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
        meusLivros.put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        System.out.println(meusLivros);

        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }    


        System.out.println("\n---\tOrdem de inserção\t---");
        Map<String, Livro> meusLivrosLink = new LinkedHashMap<>();
        meusLivrosLink.put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
        meusLivrosLink.put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
        meusLivrosLink.put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        System.out.println(meusLivrosLink);

        for (Map.Entry<String, Livro> livro : meusLivrosLink.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        } 



        System.out.println("\n---\tOrdem alfabética dos autores\t---");
        Map<String, Livro> meusLivrosTree = new TreeMap<>(meusLivrosLink);
        System.out.println(meusLivrosTree);

        for (Map.Entry<String, Livro> livro : meusLivrosTree.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        } 



        System.out.println("\n---\tOrdem alfabética dos nomes dos livros\t---");
        Set<Map.Entry<String, Livro>> meusLivrosSet = new TreeSet<>(new ComparatorNome());
        meusLivrosSet.addAll(meusLivrosLink.entrySet());
        System.out.println(meusLivrosSet);

        for (Map.Entry<String, Livro> livro : meusLivrosSet) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        } 



        System.out.println("\n---\tOrdem número de páginas\t---");
        Set<Map.Entry<String, Livro>> meusLivrosSet2 = new TreeSet<>(new ComparatorPaginas());
        meusLivrosSet2.addAll(meusLivrosLink.entrySet());
        System.out.println(meusLivrosSet2);

        for (Map.Entry<String, Livro> livro : meusLivrosSet2) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());
        } 
        
    }
    
}



class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }
    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
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
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (paginas == null) {
            if (other.paginas != null)
                return false;
        } else if (!paginas.equals(other.paginas))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "[" + nome + ", paginas = " + paginas + "]";
    }

}



class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }

}



class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
        return o1.getValue().getPaginas().compareTo(o2.getValue().getPaginas());
    }

}