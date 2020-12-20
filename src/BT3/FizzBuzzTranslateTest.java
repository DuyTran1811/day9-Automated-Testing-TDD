package BT3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class FizzBuzzTranslateTest {
    @Test
    @DisplayName("3")
    void testFizz() {
        String expected = "Fizz";
        String actual = FizzBuzzTranslate.CheckFizzBuzz(3);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("5")
    void testFizz1() {
        String expected = "Buzz";
        String actual = FizzBuzzTranslate.CheckFizzBuzz(5);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("2")
    void test2toHai() {
        int number = 2;
        String expected = "two";
        String actual = FizzBuzzTranslate.CheckFizzBuzz(number);
        assertEquals(expected, actual);
    }
}