public class EmployeNonRemunere implements Employee{
    private String name;

    public EmployeNonRemunere(String name) {
        this.name = name;
    }

    @Override
    public String showDetails() {
        return "Employé qui attends toujours sa paye mdr. Sauf que dans son contrat, il est bénévole.";
    }

    public void hierarchie() {
        System.out.println("Employé (d'après lui) : \n" + name + " : " + showDetails());
    }
}
