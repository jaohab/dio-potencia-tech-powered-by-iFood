package dio.desafios.padroesProjetos.gof.singleton;

/* 
 * Singleton "apressado".
 * 
 * @author jaohab
 */

public class SingletonEager {
    
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
    
}
