/*
 * Calcule o valor final de um empréstimo, a partir do valor solicitado.
 * Taxas e parcelas influenciam.
 * Defina arbitrariamente as faixas que influenciam nos valores.
 */

package dio.cursos.metodos;

public class Ex1_3_Emprestimo {

    public static void juros (double capital, int meses, double taxa){

        double juros = capital * taxa * meses;
        System.out.println("No final, deverá ser pago um total de R$ " + (capital+juros));
        System.out.println("Valor do juros acrecido: " + juros);
        System.out.print("\n");
        double mensal = (capital/meses) + (juros/meses);
        System.out.println("Valor a ser pago por mês: " + mensal);

    }

    public static double taxa (int meses){

        double taxa = 0;
        if (meses <= 12) taxa = 0.02;
        if (meses > 12 && meses <= 24) taxa = 0.04;
        if (meses > 24 && meses <= 36) taxa = 0.06;
        if (meses > 36) taxa = 0.08;
        System.out.println("A taxa de juros para " + meses + " mêses é de " + taxa + " ao mês.");
        return taxa;

    }

}
