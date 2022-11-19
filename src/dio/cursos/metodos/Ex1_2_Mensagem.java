/*
 * A partir da hora do dia, informa a mensagem adequada: 
 * "Bom dia", "Boa tarde" ou "Boa noite".
 */

package dio.cursos.metodos;

public class Ex1_2_Mensagem {

    public static double horario(int hora, int minuto) {

        // TESTE - MANTER COMENTADO
        //hora = 23;
        //minuto = 14;

        double horas = Double.valueOf(hora);
        double minutos = (Double.valueOf(minuto)/100);
        double horario = horas + minutos;
        return horario;
    }

}