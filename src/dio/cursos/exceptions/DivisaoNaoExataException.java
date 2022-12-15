package dio.cursos.exceptions;

public class DivisaoNaoExataException extends Exception {
    
    @SuppressWarnings("unused")
    private int numerador;
    @SuppressWarnings("unused")
    private int denominador;

    public DivisaoNaoExataException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }

}