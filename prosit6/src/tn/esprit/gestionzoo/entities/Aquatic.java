package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {

    protected String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", habitat='" + habitat + '\'';
    }

    public void swim(){
        System.out.println("this animal is swimming");
    }

    @Override
    public boolean equals(Object obj) {
        // Vérification de référence
        if (this == obj) return true;

        // Vérification du type
        if (obj == null || getClass() != obj.getClass()) return false;

        // Cast sécurisé
        Aquatic other = (Aquatic) obj;

        // Vérification des attributs name, age, habitat
        return this.getName().equals(other.getName()) &&
                this.getAge() == other.getAge() &&
                this.getHabitat().equals(other.getHabitat());
    }

}
