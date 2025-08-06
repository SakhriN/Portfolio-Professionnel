package models;

import org.example.models.GradingCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradingCalculatorTest {
    @Test
    void TestGradeA() {
        GradingCalculator calculator2000 = new GradingCalculator();
        calculator2000.setScore(95);
        calculator2000.setAttendancePercentage(90);
        char result = calculator2000.getGrade() ;
        Assertions.assertEquals('A',result);
    }

    @Test
    void TestGradeB1() {
        GradingCalculator calculator2000 = new GradingCalculator();
        calculator2000.setScore(85);
        calculator2000.setAttendancePercentage(90);
        char result = calculator2000.getGrade() ;
        Assertions.assertEquals('B',result);
    }

    @Test
    void TestGradeB2() {
        GradingCalculator calculator2000 = new GradingCalculator();
        calculator2000.setScore(95);
        calculator2000.setAttendancePercentage(65);
        char result = calculator2000.getGrade() ;
        Assertions.assertEquals('B',result);
    }

    @Test
    void TestGradeC() {
        GradingCalculator calculator2000 = new GradingCalculator();
        calculator2000.setScore(65);
        calculator2000.setAttendancePercentage(90);
        char result = calculator2000.getGrade() ;
        Assertions.assertEquals('C',result);
    }

    @Test
    void TestGradeF1() {
        GradingCalculator calculator2000 = new GradingCalculator();
        calculator2000.setScore(95);
        calculator2000.setAttendancePercentage(55);
        char result = calculator2000.getGrade() ;
        Assertions.assertEquals('F',result);
    }

    @Test
    void TestGradeF2() {
        GradingCalculator calculator2000 = new GradingCalculator();
        calculator2000.setScore(65);
        calculator2000.setAttendancePercentage(55);
        char result = calculator2000.getGrade() ;
        Assertions.assertEquals('F',result);
    }

    @Test
    void TestGradeF3() {
        GradingCalculator calculator2000 = new GradingCalculator();
        calculator2000.setScore(55);
        calculator2000.setAttendancePercentage(90);
        char result = calculator2000.getGrade() ;
        Assertions.assertEquals('F',result);
    }

}