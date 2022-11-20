package dio.desafios.padroesProjetos.gof.singleton;

/* 
 * Singleton "preguiçoso".
 * 
 * @author jaohab
 */

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
    
}
