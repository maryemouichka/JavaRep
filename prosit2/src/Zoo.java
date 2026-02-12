import java.util.Objects;

public class Zoo {

    private static final int MAX_CAGES = 25;
    private final int nbrCages;
    private Animal[] animals;
    private int nbrAnimals = 0;

    private String name;3
    private String city;

    // Constructeur
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.nbrCages = MAX_CAGES;
        this.animals = new Animal[MAX_CAGES];
    }

    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    public boolean addAnimal(Animal animal) {
        if (isFull()) {
            System.out.println("Zoo plein ! Impossible d'ajouter " + animal.name);
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println("Animal déjà présent !");
            return false;
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("Animal non trouvé !");
            return false;
        }
        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        return true;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (Objects.equals(animals[i].name, animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public void printAnimals() {
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    // ✅ Nouvelle méthode pour vérifier si le zoo est plein
    public boolean isFull() {
        return nbrAnimals >= nbrCages;
    }

    // ✅ Nouvelle méthode pour comparer deux zoos
    public static Zoo zooWithMoreAnimals(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals >= z2.nbrAnimals) {
            return z1;
        } else {
            return z2;
        }
    }
}
