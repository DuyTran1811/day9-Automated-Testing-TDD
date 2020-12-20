package BT2;

public class TriangleClassifier {
    public static TriangleType checkTriangleSide(int sideA, int sideB, int sideC) {
        if ((sideA > sideB + sideC) || (sideB > sideA + sideC) || (sideC > sideA + sideB)) {
            return TriangleType.NOT_A_TRIANGLE;
        } else if (sideA == sideB && sideB == sideC) { // 3 canh bang nhau
            return TriangleType.EQUILATERAL; // tam giac deu
        } else if (sideA == sideB) { //  2 canh bang nhau
            return TriangleType.ISOSCELES; // tam giac can
        } else {
            return TriangleType.SCALENE;
        }
    }
}
