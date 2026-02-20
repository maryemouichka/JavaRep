package tn.esprit.gestionzoo.entities;

import java.util.Arrays;
import java.util.Objects;

public class Zoo {

    private static final int MAX_CAGES = 25;
    private final int nbrCages;
    private Animal[] animals;
    private int nbrAnimals = 0;

    private String name;
    private String city;

    // Constructeur avec validation
    public Zoo(String name, String city) {
        setName(name);   // Validation via setter
        setCity(city);   // Validation via setter
        this.nbrCages = MAX_CAGES;
        this.animals = new Animal[MAX_CAGES];
    }

    // Affichage des informations du zoo
    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
        System.out.println("Nombre d'animaux : " + nbrAnimals);
    }

    // Ajouter un animal avec vérification
    public boolean addAnimal(Animal animal) {
        if (animal == null) {
            System.out.println("Animal invalide !");
            return false;
        }
        if (isFull()) {
            System.out.println("Zoo plein ! Impossible d'ajouter " + animal.getName());
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println("Animal déjà présent : " + animal.getName());
            return false;
        }
        animals[nbrAnimals++] = animal;
        return true;
    }

    // Supprimer un animal
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("Animal non trouvé : " + animal.getName());
            return false;
        }
        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[--nbrAnimals] = null;
        return true;
    }

    // Chercher un animal par nom et famille
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (Objects.equals(animals[i].getName(), animal.getName()) &&
                    Objects.equals(animals[i].getFamily(), animal.getFamily())) {
                return i;
            }
        }
        return -1;
    }

    // Afficher tous les animaux
    public void printAnimals() {
        if (nbrAnimals == 0) {
            System.out.println("Aucun animal dans ce zoo.");
            return;
        }
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    // Vérifier si le zoo est plein
    public boolean isFull() {
        return nbrAnimals >= nbrCages;
    }

    // Comparer deux zoos et retourner celui avec le plus d'animaux
    public static Zoo zooWithMoreAnimals(Zoo z1, Zoo z2) {
        return (z1.nbrAnimals >= z2.nbrAnimals) ? z1 : z2;
    }

    // Getters et Setters

    public int getNbrCages() {
        return nbrCages;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    // Retourne une copie du tableau pour protéger l'encapsulation
    public Animal[] getAnimals() {
        return Arrays.copyOf(animals, nbrAnimals);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Le nom du zoo ne doit pas être nul ou vide");
        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null || city.trim().isEmpty()) {
            System.out.println("La ville ne doit pas être vide");
        } else {
            this.city = city;
        }
    }
}
