package poo.encapsulamento.casaA;
public class Paulo {
    void testeAcessos() {
        Ana esposa = new Ana();

        // System.out.println(esposa.segredo); ==> não tem acesso "private"
        System.out.println(esposa.facoDentroDeCasa); // tem acesso "default (pacote)"
        System.out.println(esposa.formaDeFalar); // tem acesso "protected"
        System.out.println(esposa.todosSabem); // tem acesso "public"
    }
}
