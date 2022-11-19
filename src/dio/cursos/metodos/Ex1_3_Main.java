/*
 * Calcule o valor final de um empréstimo, a partir do valor solicitado.
 * Taxas e parcelas influenciam.
 * Defina arbitrariamente as faixas que influenciam nos valores.
 */

package dio.cursos.metodos;

import java.util.Scanner;

public class Ex1_3_Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Valor solicitado para o empréstimo: ");
        System.out.print("R$ ");

        double capital = Double.parseDouble(scan.next());
        
        System.out.print("\n");

        System.out.println("Quantidade de parcelas (mêses): ");
        int meses = scan.nextInt();

        scan.close();

        System.out.print("\n");

        double taxa = Ex1_3_Emprestimo.taxa(meses);

        System.out.print("\n");

        Ex1_3_Emprestimo.juros(capital, meses, taxa);
        
    }
    
}