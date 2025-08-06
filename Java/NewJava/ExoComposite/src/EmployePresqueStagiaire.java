public class EmployePresqueStagiaire implements Employee{
private String name;

    public EmployePresqueStagiaire(String name) {
        this.name = name;
    }

    @Override
    public String showDetails() {
        return "Un employé qui ne sait pas travailler donc, il est presque stagiaire.";
    }

    public void hierarchie() {
        System.out.println("Employé de merde : \n" + name + " : " + showDetails());
    }
}
