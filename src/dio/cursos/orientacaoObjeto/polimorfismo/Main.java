package dio.cursos.orientacaoObjeto.polimorfismo;

public class Main {

    public static void main(String[] args) {

        ClassMaster[] classes = new ClassMaster[]{new ClassSub1(), new ClassSub2(), new ClassMaster()};

        for (ClassMaster classe: classes) {
            classe.metodo1();
        }

        System.out.println("");

        for (ClassMaster classe: classes) {
            classe.metodo2();
        }
        
    }
    
}