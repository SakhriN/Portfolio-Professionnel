public class EmployeNonEmbauchable implements Employee{
    private String name;

    public EmployeNonEmbauchable(String name) {
        this.name = name;
    }

    @Override
    public String showDetails() {
        return "Employé qui est extremement nul et ne pourrait jamais être embauchable. " +
                "\n Mais comme c'est le petit fils du patron, on ne peut rien faire.";
    }

    public void hierarchie() {
        System.out.println("Employé avec qui on ne peut rien dire : \n" + name + " : " + showDetails());
    }

}
