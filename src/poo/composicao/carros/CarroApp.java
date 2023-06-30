package poo.composicao.carros;

public class CarroApp {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        System.out.println(c1.estaLigado()); // false

        c1.ligar();
        System.out.println(c1.estaLigado()); // true

        System.out.println(c1.motor.giros()); // 3000

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println(c1.motor.giros()); // 7800

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

        // Faltou o encapsulamento
        // c1.motor.fatorInjecao = -30;

        System.out.println(c1.motor.giros()); // 600

        // Relação bidirecional
        System.out.println(c1.motor.carro.motor.carro.motor.giros()); // 600 --> isso é possível por causa da relação bidirecional, ambos estão dentro um do outro
    }
}
