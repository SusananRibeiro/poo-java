package poo.heranca.jogo;
import poo.heranca.jogo.comandos.Direcao;
import poo.heranca.jogo.comandos.Heroi;
import poo.heranca.jogo.comandos.Monstro;

public class JogoApp {
    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.x = 10; // posições que está
        monstro.y = 10; // posições que está

        Heroi heroi = new Heroi(10, 11);
        heroi.x = 10;
        heroi.y = 11;

        System.out.println("Monstro tem => " + monstro.vida);
        System.out.println("Heroi tem => " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro tem => " + monstro.vida);
        System.out.println("Heroi tem => " + heroi.vida);
    }
}
