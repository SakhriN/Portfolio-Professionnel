package dbz.superexempledelespace.exo3;

import java.util.concurrent.Callable;

public class CalculatorCallable implements Callable<Integer>{
private int nombre;
    public CalculatorCallable(int nombre){
    this.nombre = nombre;
}

    @Override
    public Integer call() throws Exception {
        return (int) Math.pow(nombre,3);
    }
}
