package BT2;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class TriangleClassifierTest {
    @Test
    @DisplayName("Tam Giac Deu")
    public void triangle1() {
        var side1 = 2;
        var side2 = 2;
        var side3 = 2;
        var expected = TriangleType.EQUILATERAL;
        var result = TriangleClassifier.checkTriangleSide(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Tam Giac Can")
    public void triangle2() {
        var side1 = 2;
        var side2 = 2;
        var side3 = 3;
        var expected = TriangleType.ISOSCELES;
        var result = TriangleClassifier.checkTriangleSide(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Tam Giac Thuong")
    public void triangle3() {
        var side1 = 3;
        var side2 = 4;
        var side3 = 5;
        var expected = TriangleType.SCALENE;
        var result = TriangleClassifier.checkTriangleSide(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Khong Phai Tam Giac")
    public void triangle4() {
        var side1 = 8;
        var side2 = 2;
        var side3 = 3;
        var expected = TriangleType.NOT_A_TRIANGLE;
        var result = TriangleClassifier.checkTriangleSide(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Khong Phai Tam Giac")
    public void triangle5() {
        var side1 = -1;
        var side2 = 2;
        var side3 = 1;
        var expected = TriangleType.NOT_A_TRIANGLE;
        var result = TriangleClassifier.checkTriangleSide(side1, side2, side3);
        assertEquals(expected, result);
    }

}