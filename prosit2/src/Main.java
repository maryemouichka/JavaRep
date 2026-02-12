//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal( "Felidae","Lion",3,true);
        Animal a2 = new Animal("Canidae", "Wolf", 4, true);
        Animal a3 = new Animal("Ursidae", "Bear", 5, true);
        Animal a4 = new Animal("Crocodylidae", "Crocodile", 12, false);
        Animal a5 = new Animal("Equidae", "Horse", 7, true);

        Animal[] zooAnimals = {a1, a2, a3};

        Zoo myZoo = new Zoo(zooAnimals, "Happy Zoo", "Paris", 10);
        myZoo.displayZoo();

        System.out.println(myZoo.toString()) ;

    }
}