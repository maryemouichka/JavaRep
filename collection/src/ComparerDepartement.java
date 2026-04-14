import java.util.Comparator;

public class ComparerDepartement implements Comparator<Employe> {
    @Override
    public int compare(Employe e1, Employe e2) {
        return e1.getNomDepartement().compareToIgnoreCase(e2.getNomDepartement());
    }
}