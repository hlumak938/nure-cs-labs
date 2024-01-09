package Task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuadrilateralTest {
    @Test
    void testCalcArea() {
        Quadrilateral quadrilateral = new Quadrilateral(
                new Quadrilateral.Point(0d, 3d),
                new Quadrilateral.Point(3d, 3d),
                new Quadrilateral.Point(3d, 0d),
                new Quadrilateral.Point(0d, 0d)
        );
        Double expectedResult = 9d;
        Double actualResult = quadrilateral.calcArea();
        assertTrue(Math.abs(expectedResult - actualResult) < 0.001);
    }
    @Test
    void testCalcPerimeter() {
        Quadrilateral quadrilateral = new Quadrilateral(
                new Quadrilateral.Point(0d, 3d),
                new Quadrilateral.Point(3d, 3d),
                new Quadrilateral.Point(3d, 0d),
                new Quadrilateral.Point(0d, 0d)
        );
        Double expectedResult = 12d;
        Double actualResult = quadrilateral.calcPerimeter();
        assertTrue(Math.abs(expectedResult - actualResult) < 0.001);
    }
    @Test
    void testIsRhombus() {
        Quadrilateral quadrilateral = new Quadrilateral(
                new Quadrilateral.Point(0d, 3d),
                new Quadrilateral.Point(3d, 3d),
                new Quadrilateral.Point(3d, 0d),
                new Quadrilateral.Point(0d, 0d)
        );
        assertTrue(quadrilateral.isRomb());
    }
    @Test
    void testIsSquare() {
        Quadrilateral quadrilateral = new Quadrilateral(
                new Quadrilateral.Point(0d, 3d),
                new Quadrilateral.Point(3d, 3d),
                new Quadrilateral.Point(3d, 0d),
                new Quadrilateral.Point(0d, 0d)
        );
        assertTrue(quadrilateral.isSquare());
    }
    @Test
    void testIsStraight() {
        Quadrilateral quadrilateral = new Quadrilateral(
                new Quadrilateral.Point(0d, 4d),
                new Quadrilateral.Point(3d, 4d),
                new Quadrilateral.Point(3d, 0d),
                new Quadrilateral.Point(0d, 0d)
        );
        assertTrue(quadrilateral.isStraight());
    }
}
