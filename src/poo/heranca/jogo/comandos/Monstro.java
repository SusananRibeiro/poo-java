package poo.heranca.jogo.comandos;
public class Monstro extends Jogador {

    public Monstro() {
        this(0, 0); // está chamando o construtor de baixo
    }

    public Monstro(int x, int y) {
        super(x, y); // está chamado o construtor da superclasse(pai)
    }
}