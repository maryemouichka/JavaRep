public interface IGestion<T> {

    public void ajouterEmploye(T t);

    public boolean rechercherEmploye(String nom);

    public boolean rechercherEmploye(T t);

    public boolean supprimerEmploye(T t);

    public void displayEmploye();

    // Comparable
    public void trierEmployeParId();

    // Comparator
    public void trierEmployeParNomDepartementEtGrade();
}