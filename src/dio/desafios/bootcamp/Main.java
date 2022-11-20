package dio.desafios.bootcamp;

import java.time.LocalDate;

import dio.desafios.bootcamp.dominio.Bootcamp;
import dio.desafios.bootcamp.dominio.Curso;
import dio.desafios.bootcamp.dominio.Dev;
import dio.desafios.bootcamp.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria");
        mentoria.setData(LocalDate.now());

        /* 
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("João");
        dev1.inscreverBootcamp(bootcamp);

        dev1.progredir();
        dev1.progredir();

        System.out.println(dev1.getNome() + " | Conteúdos Inscritos " + dev1.getConteudosInscritos());
        System.out.println(dev1.getNome() + " | Conteúdos Concluídos " + dev1.getConteudosConcluidos());
        System.out.println(dev1.getNome() + " | XP " + dev1.calcularTotalXp());
        
        Dev dev2 = new Dev();
        dev2.setNome("Paula");
        dev2.inscreverBootcamp(bootcamp);

        dev2.progredir();

        System.out.println(dev2.getNome() + " | Conteúdos Inscritos " + dev2.getConteudosInscritos());
        System.out.println(dev2.getNome() + " | Conteúdos Concluídos " + dev2.getConteudosConcluidos());
        System.out.println(dev2.getNome() + " | XP " + dev2.calcularTotalXp());

    }
    
}