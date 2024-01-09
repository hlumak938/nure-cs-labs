package Task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    @Test
    public void testIsCollisionPossible() {
        Point p1 = new Point();
        p1.setStartPosition(0d, 0d);
        p1.setMovement(1d, 0d);
        Point p2 = new Point();
        p2.setStartPosition(1d, 0d);
        boolean result = p1.isCollisionPossible(p2);
        assertTrue(result);
    }
    @Test
    public void testCalculateDistance() {
        Point p1 = new Point();
        p1.setStartPosition(0d, 0d);
        p1.setMovement(1d, 2d);
        Point p2 = new Point();
        p2.setStartPosition(1d, 0d);
        Double expectedResult = Math.sqrt(73d);
        Double actualResult = p1.calculateDistance(p2, 4);
        assertTrue(Math.abs(expectedResult - actualResult) < 0.001);
    }
}
