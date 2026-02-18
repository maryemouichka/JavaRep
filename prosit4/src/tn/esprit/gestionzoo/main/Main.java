package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
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

        // Affichage des informations des zoos
        System.out.println("=== Informations du Zoo 1 ===");
        zoo1.displayZoo();
        System.out.println("Animaux du Zoo 1 :");
        zoo1.printAnimals();

        System.out.println("\n=== Informations du Zoo 2 ===");
        zoo2.displayZoo();
        System.out.println("Animaux du Zoo 2 :");
        zoo2.printAnimals();

        // Comparaison des zoos par nombre d'animaux
        Zoo zooAvecPlusAnimaux = Zoo.zooWithMoreAnimals(zoo1, zoo2);
        System.out.println("\nZoo avec le plus d'animaux : " + zooAvecPlusAnimaux.getName());

        // Test suppression d’un animal
        System.out.println("\nSuppression du singe du Zoo 1...");
        zoo1.removeAnimal(singe);
        System.out.println("Animaux restants dans Zoo 1 :");
        zoo1.printAnimals();

        // Test ajout d’un animal déjà présent
        System.out.println("\nTentative d'ajouter le lion encore une fois dans Zoo 1...");
        zoo1.addAnimal(lion);
    }
}
