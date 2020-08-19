import java.util.ArrayList;

import classes.*;

public class App {

    public static void main(String[] args) {

        // Instancia dos animais 
        Cachorro dog = new Cachorro();
        Gato cat = new Gato();

        dog.setNome("Adalberto");
        dog.setRaca("Buldogue");

        cat.setNome("Tonho");
        cat.setRaca("Gato");

        System.out.println(dog.caminha());
        System.out.println(cat.caminha());

        System.out.println();

        System.out.println(dog.late());
        System.out.println(cat.mia());

        System.out.println();

        // Instancia de um ArrayList de animais que suporta os 
        // tipos animais e seus filhos no caso, gato e cachorro
        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(dog);
        animais.add(cat);

        for (Animal animal : animais) {
            System.out.println(animal.getNome() + " está em um Array de animais");
        }
    }
}
