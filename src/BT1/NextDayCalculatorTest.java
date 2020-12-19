package BT1;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class NextDayCalculatorTest {
    @Test
    @DisplayName("1/1/2018")
    public void getNextDay1() {
        var day = 1;
        var month = 1;
        var year = 2018;
        var expected = "2/1/2018";
        var result = NextDayCalculator.findNextYear(day, month, year);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("31/1/2018")
    public void getNextDay31(){
        var day = 31;
        var month = 1;
        var year = 2018;
        var expected = "1/2/2018";
        var result = NextDayCalculator.findNextYear(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("30/4/20/18")
    public void getNextDay30(){
        var day = 30;
        var month = 4;
        var year = 2018;
        var expected = "1/5/2018";
        var result = NextDayCalculator.findNextYear(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("28/2/2018")
    public void getNextDay28(){
        var day = 28;
        var month = 2;
        var year = 2018;
        var expected = "1/3/2018";
        var result = NextDayCalculator.findNextYear(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("29/2/2020")
    public void getNextDay29(){
        var day = 29;
        var month = 2;
        var year = 2020;
        var expected = "1/3/2020";
        var result = NextDayCalculator.findNextYear(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("31/12/2018")
    public void getNextDay311(){
        var day = 31;
        var month = 12;
        var year = 2018;
        var expected = "1/1/2019";
        var result = NextDayCalculator.findNextYear(day,month,year);
        assertEquals(expected,result);
    }
}