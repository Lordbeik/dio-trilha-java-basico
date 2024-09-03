public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // parâmetro pra mudar para um canal especifico onde o "novo canal é atribuido ao canal"
    public void mudarCanal (int  novoCanal){
        canal = novoCanal;
    }
 
    // método para aumentar canal 1+1
    public void aumentarCanal(){
        canal++;
        
    }
    //metodo para diminuir canal 1-1
    public void diminuirCanal(){
        canal--;
        
    }

   
    public void aumentarVolume(){
         //volume = volume + 1;
        volume++;
        System.out.println("O volume está aumentando para "+volume);
    }
    public void diminuirVolume(){
        //volume = volume - 1;
        volume--;
        System.out.println("O volume está diminuindo para " +volume);
    }


    // método para ligar 
    public void ligar(){
        ligada = true;
    }

    //método para desligar
    public void desligar(){
        ligada = false;
    }

}
