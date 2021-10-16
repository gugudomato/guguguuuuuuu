public class Quest3_voo {

    public static void main(String[] args){

        Quest3_aviao_simulador gol = new Quest3_aviao_simulador(900, 10);

        System.out.println("Velocidade: "+gol.getVelocidade()+" Km/h");
        System.out.println("Altitude: "+gol.getAltitude()+" Km\n");

        gol.menosAltitude(1);
        gol.menosVelocidade(100);

        System.out.println("Velocidade: "+gol.getVelocidade()+" Km/h");
        System.out.println("Altitude: "+gol.getAltitude()+" Km");

    }
}
