package dio.desafios.padroesProjetos.gof.facade;

import dio.desafios.padroesProjetos.gof.facade.subsistema1.crm.CrmService;
import dio.desafios.padroesProjetos.gof.facade.subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente (String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String uf = CepApi.getInstancia().recuperarUf(cep);
    
        CrmService.gravarCliente(nome, cep, cidade, uf);
    }
}
