package poo.encapsulamento.casaB;
import poo.encapsulamento.casaA.Ana;
public class Julia {
    void testeAcessos() {
        Ana nora = new Ana();
        //System.out.println(sogra.segredo); ==> não tem acesso "private"
        //System.out.println(sogra.facoDentroDeCasa); ==> não tem acesso "default (pacote)"
        //System.out.println(sogra.formaDeFalar); ==> não tem acesso "protected"
        System.out.println(nora.todosSabem); // tem acesso "public"
    }
}
