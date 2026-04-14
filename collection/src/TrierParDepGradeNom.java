import java.util.Comparator;

public class TrierParDepGradeNom implements Comparator<Employe> {

    @Override
    public int compare(Employe e1, Employe e2) {
        return new ComparerDepartement()
                .thenComparing(new ComparerGrade())
                .thenComparing(new ComparerNom())
                .compare(e1, e2);
    }
}