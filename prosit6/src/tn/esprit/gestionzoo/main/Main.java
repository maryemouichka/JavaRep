package tn.esprit.gestionzoo.main;

import org.w3c.dom.ls.LSOutput;
import tn.esprit.gestionzoo.entities.*;

public class Main {

    public static void main(String[] args) {

        // Création de deux zoos
        Zoo zoo1 = new Zoo("Zoo de Tunis", "Tunis");
        Zoo zoo2 = new Zoo("Zoo de Sousse", "Sousse");

        // Création des animaux
        Animal lion = new Animal("Félidés", "Lion", 5, true);
        Animal tigre = new Animal("Félidés", "Tigre", 4, true);
        Animal singe = new Animal("Primates", "Singe", 2, true);
        Animal elephant = new Animal("Éléphantidés", "Éléphant", 10, true);
        Animal crocodile = new Animal("Crocodiliens", "Crocodile", 7, false);

        // Ajout des animaux aux zoos
        zoo1.addAnimal(lion);
        zoo1.addAnimal(singe);
        zoo1.addAnimal(elephant);



        Aquatic a1 = new Aquatic("Poisson", "Nemo", 2, false, "Mer");
        Aquatic a2 = new Dolphin("Delphinidae", "Flipper", 5, true, "Océan", 25.5f);
        Aquatic a3 = new Penguin("Spheniscidae", "Pingo", 3, true, "Antarctique", 12.0f);

        zoo2.addAquaticAnimal(a1);
        zoo2.addAquaticAnimal(a2);
        zoo2.addAquaticAnimal(a3);



        zoo2.swimAllAquatics();

        System.out.println(zoo2.MaxpenguinSwimmingDepth());
zoo2.displayNumberOfAquaticsByType();
    }
}
