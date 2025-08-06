public class EmployeFictif implements Employee{
private String name;

    public EmployeFictif(String name) {
        this.name = name;
    }

    @Override
    public String showDetails() {
        return "Employé qui n'a jamais existé mais on l'utilise comme excuse pour le blanchiment d'argent.";
    }

    public void hierarchie() {
        System.out.println("Employé qu'on n'a jamais vu dans la même pièce avec Batman : \n" + name + " : " + showDetails());
    }
}
