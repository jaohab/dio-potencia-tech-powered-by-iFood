package dio.cursos.collections.maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.LinkedHashMap;;

public class ExemploMap {

    public static void main(String[] args) {

        /*
         * Dado os modelos dos carros e seus respectivos consumos na estrada, faça:
         * Modelo: Gol  - Consumo: 14,4 km/l
         * Modelo: Uno  - Consumo: 15,6 km/l
         * Modelo: Mobi - Consumo: 16,1 km/l
         * Modelo: HB20 - Consumo: 14,5 km/l
         * Modelo: Kwid - Consumo: 15,6 km/l
         */

        // Map carros = new HashMap<>();                    //Antes do Java 5
        // Map<String, Double> carros = new HashMap<>();    //Generics (jdk 5) - Diamond Operator (jdk 7)
        // HashMap<String, Double> carros = new HashMap<>();
        // Map<String, Double> carros = Map.of("Gol", 14.4, "Uno", 15.6, "Mobi", 16.1, "HB20", 14.5, "Kwid", 15.6);

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>();
        carrosPopulares.put("Gol", 14.4);
        carrosPopulares.put("Uno", 15.6);
        carrosPopulares.put("Mobi", 16.1);
        carrosPopulares.put("HB20", 14.5);
        carrosPopulares.put("Kwid", 15.6);
        System.out.println(carrosPopulares);


        System.out.println("\nSubstitua o consumo do Gol por 15,2 km/l: ");
        carrosPopulares.put("Gol", 16.1);
        System.out.println(carrosPopulares);


        System.out.println("\nConfira se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("Tuckson"));


        System.out.println("\nExiba o consumo do Uno: " + carrosPopulares.get("Uno"));


        // Método Map não guarda a ordem original de inserção de elementos.


        System.out.println("\nExiba os modelos: " + carrosPopulares.keySet());


        System.out.println("\nExiba os consumos dos carros: " + carrosPopulares.values());


        System.out.println("\nExiba o modelo mais econômico e seu consumo: ");
        double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        String carroMaisEficiente = "";
        for (String carro : carrosPopulares.keySet()) {
            if (carrosPopulares.get(carro).equals(consumoMaisEficiente)) {
                carroMaisEficiente = carro;      
                System.out.println(carroMaisEficiente + ", " + carrosPopulares.get(carroMaisEficiente));
            }
        }


        System.out.println("\nExiba o modelo menos econômico e seu consumo: ");
        for (String carro : carrosPopulares.keySet()) {
            if (carrosPopulares.get(carro).equals(Collections.min(carrosPopulares.values()))) {   
                System.out.println(carro + ", " + carrosPopulares.get(carro));
            }
        }
        

        System.out.print("\nExiba a soma dos consumos: ");
        double soma = 0d;
        for (double consumo : carrosPopulares.values()) {
            soma += consumo;
        }
        System.out.println(soma);


        System.out.println("\nExiba a média dos consumos deste dicionário de carros: " + (soma / carrosPopulares.size()));
        

        System.out.println("\nRemova os modelos com consumo igual a 15,6 km/l: ");
        Iterator<Double> it = carrosPopulares.values().iterator();
        while(it.hasNext()) {
            if(it.next() == 15.6) it.remove();
        }
        System.out.println(carrosPopulares);
        
        
        System.out.println("\nExiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopularesLink = new LinkedHashMap<>();
        carrosPopularesLink.put("Gol", 14.4);
        carrosPopularesLink.put("Uno", 15.6);
        carrosPopularesLink.put("Mobi", 16.1);
        carrosPopularesLink.put("HB20", 14.5);
        carrosPopularesLink.put("Kwid", 15.6);
        System.out.println(carrosPopularesLink);


        System.out.println("\nExiba o dicionário ordenado pelo medelo: ");
        Map<String, Double> carrosPopularesTree = new TreeMap<>();
        carrosPopularesTree.putAll(carrosPopularesLink);
        System.out.println(carrosPopularesTree);


        System.out.println("\nApague o dicionário de carros: ");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);
        

        System.out.println("\nConfira se o dicionário está vazio: " + carrosPopulares.isEmpty());

    }
    
}
