public class Main {
    public static void main(String[] args) {

        Zoo zoo1 = new Zoo("Happy Zoo", "Paris");
        Zoo zoo2 = new Zoo("Wild Zoo", "Lyon");

        Animal a1 = new Animal("Felidae", "Lion", 3, true);
        Animal a2 = new Animal("Canidae", "Wolf", 4, true);
        Animal a3 = new Animal("Ursidae", "Bear", 5, true);

        // Ajouter des animaux
        zoo1.addAnimal(a1);
        zoo1.addAnimal(a2);

        zoo2.addAnimal(a1);
        zoo2.addAnimal(a2);
        zoo2.addAnimal(a3);

        // Afficher si un zoo est plein
        System.out.println("Zoo1 plein ? " + zoo1.isFull());
        System.out.println("Zoo2 plein ? " + zoo2.isFull());

        // Comparer les zoos
        Zoo biggerZoo = Zoo.zooWithMoreAnimals(zoo1, zoo2);
        System.out.println("Le zoo avec le plus d'animaux est : " + biggerZoo.name);

        // Afficher les animaux
        System.out.println("\nAnimaux dans le zoo le plus grand :");
        biggerZoo.printAnimals();
    }
}
