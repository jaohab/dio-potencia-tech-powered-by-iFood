/*
 * A partir da hora do dia, informa a mensagem adequada: 
 * "Bom dia", "Boa tarde" ou "Boa noite".
 */

package dio.cursos.metodos;

import java.time.LocalDateTime;

public class Ex1_2_Main {

    public static void main(String[] args) {

        // Coletando horas e minutos
        int hora = LocalDateTime.now().getHour();
        System.out.println("Horas : " + hora);
        int minuto = LocalDateTime.now().getMinute();
        System.out.println("Minutos : " + minuto);

        double horario = Ex1_2_Mensagem.horario(hora, minuto);

        System.out.println("Horas e minutos : " + horario);

        if (horario >= 0.0 && horario < 12.0) {
            System.out.println("Bom dia");
        }
        if (horario >= 12.0 && horario < 18.0) {
            System.out.println("Boa tarde");
        }
        if (horario >= 18.0) {
            System.out.println("Boa noite");
        }
        
    }
    
}