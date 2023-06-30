package poo.abstrato;
public class AnimalApp {
    public static void main(String[] args) {

        //Animal a = new Cachorro(); //
        Mamifero a = new Cachorro(); // tem o métdodo mover e mamar
        System.out.println(a.mover());
        System.out.println(a.mamar());
        System.out.println(a.respirar());
    }
}
