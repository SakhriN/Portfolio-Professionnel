import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
    private String name;
    List<Employee> employees =  new ArrayList<Employee>();

    public Manager(String name) {
        this.name = name;
    }

    public void add(Employee employee){
        employees.add(employee);
    }

    public void remove(Employee employee){
        employees.remove(employee);
    }

    @Override
    public String showDetails() {
        return "Le fils de **** qui se croit au dessus des autres.";
    }

    @Override
    public void hierarchie() {
        System.out.println("Supérieur hiérachique : \n" + name + " : " + showDetails());
        for (Employee employee : employees){
            employee.hierarchie();
        }
    }
}
