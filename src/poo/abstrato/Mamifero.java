package poo.abstrato;

public abstract class Mamifero extends Animal {

    public abstract String mamar();

    @Override
    public String mover() { // usado "final" torna o método concreto, ou seja, ele não pode ser sobrescrito em subclasses
        return "Saindo do lugar";
    }
}
