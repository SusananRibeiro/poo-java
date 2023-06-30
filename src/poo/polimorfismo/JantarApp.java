package poo.polimorfismo;

public class JantarApp {
    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(99.65);
        Arroz ingrediente1 = new Arroz(0.200);
        Feijao ingrediente2 = new Feijao(0.100);
        Comida ingrediente3 = new Arroz(0.300); // Pode se ter o tipo "Comida", mas não pode instanciar, precisa ser uma classe que herde de comida

        System.out.println(convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        convidado.comer(ingrediente3);
        System.out.println(convidado.getPeso());

        Sorvete sobremesa = new Sorvete(0.400);
        convidado.comer(sobremesa);
        System.out.println(convidado.getPeso());

    }

}
