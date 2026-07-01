package ejercicios;

sealed interface Animal permits Perro, Gato {
    void sonido();
}

final class Perro implements Animal {
    public void sonido() {
        System.out.println("El perro dice: Guau");
    }
}

final class Gato implements Animal {
    public void sonido() {
        System.out.println("El gato dice: Miau");
    }
}

public class sealedClasses {
    public static void main(String[] args) {
        Animal[] animales = { new Perro(), new Gato() };
        for (Animal a : animales) {
            a.sonido();
        }
    }
}