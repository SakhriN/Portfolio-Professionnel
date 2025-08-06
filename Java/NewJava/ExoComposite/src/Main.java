public class Main {
    public static void main(String[] args) {

        Employee employeeFictif = new EmployeFictif("Robert Pattinson");
        Employee employeeNonEmbauche = new EmployeNonEmbauchable("Kylian Mbappe");
        Employee employeeNonRemunere = new EmployeNonRemunere("Benevole 12");
        Employee employeePayeAuLancePierre = new EmployePayeAuLancePierre("Random 12");
        Employee employeePresqueStagiaire = new EmployePresqueStagiaire("Joe Wilfried Tsonga");
        Manager manager = new Manager("Nassim Sakhri");

        manager.add(employeeFictif);
        manager.add(employeeNonEmbauche);
        manager.add(employeeNonRemunere);
        manager.add(employeePayeAuLancePierre);
        manager.add(employeePresqueStagiaire);

        manager.hierarchie();

    }
}