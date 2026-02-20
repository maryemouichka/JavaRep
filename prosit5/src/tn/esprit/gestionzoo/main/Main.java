package tn.esprit.gestionzoo.main;

import org.w3c.dom.ls.LSOutput;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Zoo;

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

        zoo2.addAnimal(tigre);
        zoo2.addAnimal(crocodile);

        Dolphin d1 = new Dolphin("Delphinidae", "Flipper", 5, true, "Océan", 25.5f);

        System.out.println(d1.toString());

        d1.swim();

    }
}
