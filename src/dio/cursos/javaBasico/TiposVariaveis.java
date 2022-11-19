package dio.cursos.javaBasico;

public class TiposVariaveis {

    public static void main (String[] args) {
    
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal;

        //Constantes
        final int NUMERO = 10;
        final double PI = 3.14;

        System.out.println(numeroCurto2 + " " + NUMERO + " " + PI);
        
    }

}