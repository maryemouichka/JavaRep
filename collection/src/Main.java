import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        SocieteArrayList societe = new SocieteArrayList();

        societe.ajouterEmploye(new Employe(3, "Sami" ,"b", "IT", 2));
        societe.ajouterEmploye(new Employe(1, "Ahmed", "c", "RH", 1));
        societe.ajouterEmploye(new Employe(5,"d", "Yasmine", "IT", 1));
        societe.ajouterEmploye(new Employe(2, "e","Amal", "Finance", 3));

        System.out.println("=== LISTE ===");
        societe.displayEmploye();

        System.out.println("\n=== TRI PAR ID ===");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\n=== TRI DEP + GRADE + NOM ===");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();

        System.out.println("\nRecherche Ahmed: " +
                societe.rechercherEmploye("Ahmed"));

        System.out.println("Suppression ID=3: " +
                societe.supprimerEmploye(new Employe(3, "Sami","b", "IT", 2)));

        System.out.println("\n=== APRÈS SUPPRESSION ===");
        societe.displayEmploye();


    System.out.println("\n=== RECHERCHE PAR DÉPARTEMENT (IT) ===");

    List<Employe> itEmployes = societe.rechercherParDepartement("IT");
    System.out.println(itEmployes);

    }
}