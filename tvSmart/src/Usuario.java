public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();


        smartTv.mudarCanal(40);

        System.out.println("Canal Atual :"+smartTv.canal);


        System.out.println("TV Ligada ? "+ smartTv.ligada);
        System.out.println("Canal Atual :"+smartTv.canal);
        System.out.println("Volume Atual : "+smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();  
        smartTv.aumentarVolume();

        smartTv.ligar();
        System.out.println("Novo Estatus --> TV Ligada ? "+ smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Estatus --> TV Ligada ? "+ smartTv.ligada);
    }
}
