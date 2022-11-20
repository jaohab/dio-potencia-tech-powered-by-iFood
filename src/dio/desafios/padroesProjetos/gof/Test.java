package dio.desafios.padroesProjetos.gof;

import dio.desafios.padroesProjetos.gof.facade.Facade;
import dio.desafios.padroesProjetos.gof.singleton.SingletonEager;
import dio.desafios.padroesProjetos.gof.singleton.SingletonLazy;
import dio.desafios.padroesProjetos.gof.singleton.SingletonLazyHolder;
import dio.desafios.padroesProjetos.gof.strategy.Comportamento;
import dio.desafios.padroesProjetos.gof.strategy.ComportamentoAgressivo;
import dio.desafios.padroesProjetos.gof.strategy.ComportamentoDefensivo;
import dio.desafios.padroesProjetos.gof.strategy.ComportamentoNormal;
import dio.desafios.padroesProjetos.gof.strategy.Robo;

public class Test {
    
    public static void main(String[] args) {
        
        // Teste relacionados ao Design Pattern Singleton:

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        // Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("João", "13010999");

    }

}
