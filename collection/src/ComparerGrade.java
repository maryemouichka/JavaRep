import java.util.Comparator;

public class ComparerGrade implements Comparator<Employe> {
    @Override
    public int compare(Employe e1, Employe e2) {
        return Integer.compare(e1.getGrade(), e2.getGrade());
    }
}