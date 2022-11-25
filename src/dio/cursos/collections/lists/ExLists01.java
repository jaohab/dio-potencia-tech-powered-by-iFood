package dio.cursos.collections.lists;

import java.util.ArrayList;
import java.util.List;

/*
 * Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
 * 
 * Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e em que mês elas ocorreram.
 * 
 * Exemplo:
 * Mostrar o mês por extenso: 1 - Janeiro, 2 Fevereiro e etc.
 */

public class ExLists01 {

    public static void main(String[] args) {

        // Criação da lista
        List<Mes> meses = new ArrayList<>();
        // System.out.println(meses);

        // Adicionando elementos na listas
        meses.add(new Mes("Janeiro", 20.5));
        meses.add(new Mes("Fevereiro", 21d));
        meses.add(new Mes("Março", 21.7));
        meses.add(new Mes("Abril", 21.8));
        meses.add(new Mes("Maio", 21.2));
        meses.add(new Mes("Junho", 20.9));
        System.out.println(meses);

        // Calcular média
        double media = 0d;

        for (Mes temp : meses) {
            //System.out.println(temp.getTemperatura());
            media += temp.getTemperatura();
        }
        //System.out.println(media);
        media = media / meses.size();
        System.out.println("Média de temperatura: " + media);

        // Exibir meses acima da média
        for (Mes mes : meses) {
            if (mes.getTemperatura() >= media ) System.out.println("Meses com temperatura acima da média: " + mes);
        }

    }
    
}



class Mes {
    private String mes;
    private double temperatura;

    public Mes(String mes, double temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }
    public double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "[Mês = " + mes + ", Temperatura = " + temperatura + "]";
    }

}