package dio.cursos.orientacaoObjeto.upcastDowncast;

public class Main {

    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();

        // Upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // Downcast - evitar a utilização
        // Apesar da sintaxe estar correta, ao executar irá ocorrer um erro.

        /*
        Gerente gerente2 = (Gerente) new Funcionario();
        Vendedor vendedor2 = (Vendedor) new Funcionario();
        Faxineiro faxineiro2 = (Faxineiro) new Funcionario();
         */

        System.out.println(funcionario);
        System.out.println(gerente);
        System.out.println(vendedor);
        System.out.println(faxineiro);
        
    }
    
}