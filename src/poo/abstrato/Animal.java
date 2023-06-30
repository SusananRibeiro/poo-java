package poo.abstrato;
public abstract class Animal {

    public String respirar() {
        return "Usando Oxigênio";
    }

    public abstract String mover(); // Só pode se ter métodos abstratos em classes abstratas
}

