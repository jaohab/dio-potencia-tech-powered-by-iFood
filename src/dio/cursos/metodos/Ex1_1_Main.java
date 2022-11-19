/*
 * Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão.
 * Sempre 2 devem ser passados. 
 */

package dio.cursos.metodos;

import java.util.Scanner;

public class Ex1_1_Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String opcao;
        double x, y, res;

        opcao = Ex1_1_Calculadora.iniciar(scan); 

        while (!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && !opcao.equals("4")) {
            System.out.println("\nVocê inseriu uma opção inválida.\n");
            opcao = Ex1_1_Calculadora.iniciar(scan); 
        }

        switch (opcao) {
            case "1":
                System.out.println("\nSOMAR\n");
                System.out.print("Insira o primeiro número: ");
                x = Double.parseDouble(scan.next());
                System.out.print("Insira o segundo número: ");
                y = Double.parseDouble(scan.next());

                res = Ex1_1_Calculadora.somar(x, y);
                
                System.out.print("\n1Resultado da soma: " + res);
                
                break;
                
            case "2":
                System.out.println("\nSUBTRAIR\n");
                System.out.print("Insira o primeiro número: ");
                x = Double.parseDouble(scan.next());
                System.out.print("Insira o segundo número: ");
                y = Double.parseDouble(scan.next());

                res = Ex1_1_Calculadora.subtrair(x, y);
            
                System.out.print("\nResultado da subtração: " + res);
                        
                break;
            
            case "3":
                System.out.println("\nMULTIPLICAR\n");
                System.out.print("Insira o primeiro número: ");
                x = Double.parseDouble(scan.next());
                System.out.print("Insira o segundo número: ");
                y = Double.parseDouble(scan.next());

                res = Ex1_1_Calculadora.multiplicar(x, y);

                System.out.print("\nResultado da multiplicação: " + res);
                               
                break;

            case "4":
                System.out.println("\nDIVIDIR\n");
                System.out.print("Insira o primeiro número: ");
                x = Double.parseDouble(scan.next());
                while (x == 0) {
                    System.out.println("O valor precisa ser diferente de 0 (zero).");
                    System.out.print("Insira o primeiro número: ");
                    x = Double.parseDouble(scan.next());
                }
                System.out.print("Insira o segundo número: ");
                y = Double.parseDouble(scan.next());
                while (y == 0) {
                    System.out.println("O valor precisa ser diferente de 0 (zero).");
                    System.out.print("Insira o segundo número: ");
                    y = Double.parseDouble(scan.next());
                }

                res = Ex1_1_Calculadora.dividir(x, y);

                System.out.print("\nResultado da divisão: " + res);
                
                break;
        
            default:

                break;
        }

        scan.close();
        
    }
    
}