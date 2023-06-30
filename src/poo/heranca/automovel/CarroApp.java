package poo.heranca.automovel;
import poo.heranca.automovel.carros.Carro;
import poo.heranca.automovel.carros.Civic;
import poo.heranca.automovel.carros.Ferrari;
public class CarroApp {

    public static void main(String[] args) {

        Carro civic = new Civic();

        civic.acelerar();
        System.out.println(civic);

        civic.acelerar();
        System.out.println(civic);

        civic.acelerar();
        System.out.println(civic);


        Ferrari ferrari = new Ferrari(400); // Pode ser feito dessa forma também "Ferrari ferrari = new Ferrari();"
        //ferrari.ligarTurbo();
        ferrari.ligarTurbo();
        ferrari.ligarAr();
        ferrari.desligarAr();

        System.out.println(ferrari.velocidadeDoAr());

        ferrari.acelerar();
        ferrari.frear();
        System.out.println("Ferrari: " + ferrari);

        ferrari.acelerar();
        ferrari.frear();
        System.out.println("Ferrari: " + ferrari);

        ferrari.acelerar();
        System.out.println("Ferrari: " + ferrari);

    }

}

