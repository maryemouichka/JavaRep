import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>,IRechercheAvancee<Employe> {

    private ArrayList<Employe> employes;

    public SocieteArrayList() {
        this.employes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employes) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employes.contains(e);
    }

    @Override
    public boolean supprimerEmploye(Employe e) {
        return employes.remove(e);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : employes) {
            System.out.println(e);
        }
    }
    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        employes.sort(new TrierParDepGradeNom());
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {

        List<Employe> result = new ArrayList<>();

        for (Employe e : employes) {
            if (e.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                result.add(e);
            }
        }

        return result;
    }
}
