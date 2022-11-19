package dio.cursos.javaBasico;

public class Operadores {

    public static void main (String[] args){

        int numero = 5;
        boolean variavel = true;

        numero = - numero;
        System.out.println(numero);

        numero = - numero;
        System.out.println(numero);

        //numero = numero +1;
        numero++;
        System.out.println(numero);
        
        //numero = numero -1;
        numero--;
        System.out.println(numero);

        System.out.println(!variavel);
        System.out.println(variavel);

        variavel = !variavel;
        System.out.println(variavel);

        //===========================

        int a, b;
        a=5;
        b=6;

        String resultado1 = a==b ? "Verdadeiro" : "Falso";
        System.out.println(resultado1);

        int resultado2 = a==b ? 1 : 0;
        System.out.println(resultado2);

        //===========================

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numero1 é diferentede a numero2? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numero1 é maior que numero2? " + simNao);

        simNao = numero1 < numero2;
        System.out.println("numero1 é menor que numero2? " + simNao);

        String nome1 = "NOME";
        String nome2 = new String("NOME");
        System.out.println("Os nomes são iguais? " + nome1.equals(nome2));

        //===========================

        // && = e
        // || = ou

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As condições são verdadeiras.");
        } else {
            System.out.println("Fim");
        }

        if (condicao1 || condicao2) {
            System.out.println("Umas das condições é verdadeiras.");
        } else {
            System.out.println("Fim");
        }
        
    }
    
}