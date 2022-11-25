package dio.cursos.collections.lists;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/*
 * Utlizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
 * 
 * 1. "Telefonou para a vítima?"
 * 2. "Esteve no local do crime?"
 * 3. "Mora perto da vítima?"
 * 4. "Devia para a vítima?"
 * 5. "Já trabalhou com a vítima?"
 * 
 * Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice"e 5 como "Assassina".
 * Caso contrário, ela será classificada como "Inocente".
 */

public class ExLists02 {

    public static void main(String[] args) {

        // Criando a lista e adicionando as perguntas
        List<String> perguntas = new ArrayList<>();
        //System.out.println(perguntas);
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");
        //System.out.println(perguntas);

        // Lista para receber as respostas
        List<Boolean> suspeito001 = new ArrayList<>();

        // Fazendo as perguntas
        int res = 0;
        int temp;
        for (String pergunta : perguntas) {
            temp = JOptionPane.showConfirmDialog(null, pergunta, "INVESTIGAÇÃO", 0);
            if (temp == 0) {
                suspeito001.add(true);
                res++;
            } else {
                suspeito001.add(false);
            }
        }
        //System.out.println(suspeito001);

        // Conclusão

        if (res < 2) System.out.println("Inocente");
        if (res == 2) System.out.println("Suspeito");
        if (res >= 3 && res <=4) System.out.println("Cúmplice");
        if (res >= 5) System.out.println("Assassino");
        
    }

}