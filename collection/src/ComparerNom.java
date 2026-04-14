import java.util.Comparator;

public class ComparerNom implements Comparator<Employe> {
    @Override
    public int compare(Employe e1, Employe e2) {
        return e1.getNom().compareToIgnoreCase(e2.getNom());
    }
}