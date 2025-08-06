package models;

import org.example.models.Exo3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Exo3Test {
    Exo3 exo3 = new Exo3();
    Integer year ;


    @Test
    void Test1(){
        year = 2000;
        Integer result = year%400;
        Assertions.assertEquals(0,result);
    }


    @Test
    void Test2(){
        year = 36;
        Integer result4 = year%4;
        Integer result100 = year%100;
        Assertions.assertTrue(result4==0 && result100!=0);
    }


    @Test
    void Test3(){
        year = 4000;
        Integer result4000 = year%4000;
        Assertions.assertEquals(0,result4000);
    }




}
