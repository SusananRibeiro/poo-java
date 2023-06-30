package poo.heranca.automovel.carros;
public interface Luxo {

    void ligarAr();
    void desligarAr();

    default int velocidadeDoAr() {
        return 1;
    }
}
