package poo.encapsulamento.casaB;
import poo.encapsulamento.casaA.Ana; // Como Ana está em outro pacote, precisa importar
public class Pedro extends Ana {
    void testeAcessos() {
        // System.out.println(segredo); ==> não tem acesso "private"
        // System.out.println(facoDentroDeCasa); ==> não tem acesso "default (pacote)"
        System.out.println(formaDeFalar); // ==> não tem acesso "protected"
        System.out.println(todosSabem); // tem acesso "public"
        System.out.println(new Ana().todosSabem); // tem acesso "public"
    }
}
