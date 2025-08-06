public class EmployePayeAuLancePierre implements Employee{
    private String name;

    public EmployePayeAuLancePierre(String name) {
        this.name = name;
    }

    @Override
    public String showDetails() {
        return "Employé qu'on n'a pas envie de payer.";
    }

    public void hierarchie() {
        System.out.println("Employé payé au lance pierre : \n" + name + " : " + showDetails());
    }
}
