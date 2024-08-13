public class Main {
    public static void main(String[] args) {

        Motor motorCarro = new Motor(258.0, "V6 turbo diesel");
        Carro car = new Carro("Volkswagen", "Amarok V6", 2024, 4, motorCarro);

        Motor motorMoto = new Motor(14.9, "OHC, Monocilíndrico 4 tempos, arrefecido a ar,com uma cilindrada de 162,7 cc");
        Moto moto1 = new Moto("Honda", "CG 160 Fan", 2024, "CG", motorMoto);

        System.out.println(car+"\n-------------------------------\n");
        System.out.println(moto1+"\n-------------------------------\n");
    }
}