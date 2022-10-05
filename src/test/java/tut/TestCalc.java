package tut;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalc {
    @Test
    public void AddTest(){
        assertEquals(2,tut.Calc.add(1,1));
    }
    @Test
    public void SubtractTest(){
        assertEquals(1,tut.Calc.subtract(2,1));
    }

}