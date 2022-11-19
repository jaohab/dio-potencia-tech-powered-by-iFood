/*
 * Desafio
 * 
 * Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']' determine se uma determinada string é válida.
 */

package dio.desafios.intermediario;

import java.util.Scanner;

public class validacaoParenteses {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        String frase = scanner.next();
        boolean caracter = ehValido(frase);
        scanner.close();
        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        // Implemente a lógica de caracteres válidos e retorne se a string é valida ou não.

        // Verificar conteúdo recebido.
        System.out.println(s);
        boolean valido = false;

        while(!valido) {
            if (s.contains("(") && s.contains(")")) {
                valido = true;
                break;
            }

            if (s.contains("{") && s.contains("}")) {
                valido = true;
                break;
            }

            if (s.contains("[") && s.contains("]")) {
                valido = true;
                break;
            }
            break;
        }
        
        return valido;
    }
    
}