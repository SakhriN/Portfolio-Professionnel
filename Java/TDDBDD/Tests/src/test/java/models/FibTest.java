package models;

import org.example.models.Fib;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibTest {


    @Test
    void Test1() {
        Fib fibo = new Fib(1);
        List<Integer> testo = fibo.getFibSeries();
        Assertions.assertEquals(Arrays.asList(0), testo);
    }

    @Test
    void Test6() {
        Fib fibo = new Fib(6);
        List<Integer> testo = fibo.getFibSeries();
        Assertions.assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5), testo);
    }
}
