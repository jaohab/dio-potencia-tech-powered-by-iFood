package dio.cursos.javaBasico;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar (){
        ligada=true;
    }

    public void desligar (){
        ligada=false;
    }

    public void aumentarVolume (){
        volume++;
        System.out.println("Aumentando o volume: " + volume);
    }

    public void diminuirVolume (){
        volume--;
        System.out.println("Diminuindo o volume: " + volume);
    }

    public void aumentarCanal (){
        canal++;
        System.out.println("Aumentando o canal: " + canal);
    }

    public void diminuirCanal (){
        canal--;
        System.out.println("Diminuindo o canal: " + canal);
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
        System.out.println("Novo canal: " + canal);
    }

}