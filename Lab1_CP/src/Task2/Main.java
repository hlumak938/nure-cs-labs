package Task2;

import java.util.Comparator;
import java.util.List;
import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task A:");
        Point p1 = new Point();
        p1.setStartPosition(0d, 0d);
        p1.setMovement(2d, 0d);
        Point p2 = new Point();
        p2.setStartPosition(1d, 0d);
        System.out.println("The velocity of the point along x = " + p1.xPerSecond
                + " perSecond\nThe velocity of the point along y = " + p1.yPerSecond +
                " perSecond\nDistance between points = " +
                p1.calculateDistance(p2,4) + "\nCollision: " + p1.isCollisionPossible(p2));
        System.out.println("Task B:");
        List<Quadrilateral> quadrilaterals = asList(
                new Quadrilateral(
                        new Quadrilateral.Point(0d, 3d),
                        new Quadrilateral.Point(3d, 3d),
                        new Quadrilateral.Point(3d, 0d),
                        new Quadrilateral.Point(0d, 0d)
                ),
                new Quadrilateral(
                        new Quadrilateral.Point(0d, 2d),
                        new Quadrilateral.Point(2d, 2d),
                        new Quadrilateral.Point(2d, 0d),
                        new Quadrilateral.Point(0d, 0d)
                ),
                new Quadrilateral(
                        new Quadrilateral.Point(0d, 2d),
                        new Quadrilateral.Point(2d, 2d),
                        new Quadrilateral.Point(2d, 0d),
                        new Quadrilateral.Point(0d, 0d)
                ),
                new Quadrilateral(
                        new Quadrilateral.Point(0d, 6d),
                        new Quadrilateral.Point(8d, 7d),
                        new Quadrilateral.Point(8d, -2d),
                        new Quadrilateral.Point(0d, 0d)
                ),
                new Quadrilateral(
                        new Quadrilateral.Point(0d, 4d),
                        new Quadrilateral.Point(3d, 4d),
                        new Quadrilateral.Point(3d, 0d),
                        new Quadrilateral.Point(0d, 0d)
                )
        );
        System.out.println("Rhombus:");
        quadrilaterals.stream()
                .filter(Quadrilateral::isRomb)
                .sorted(Comparator.comparing(Quadrilateral::calcPerimeter))
                .forEach(System.out::println);
        System.out.println("Squares:");
        quadrilaterals.stream()
                .filter(Quadrilateral::isSquare)
                .sorted(Comparator.comparing(Quadrilateral::calcPerimeter))
                .forEach(System.out::println);
        System.out.println("Straight quadrilaterals:");
        quadrilaterals.stream()
                .filter(Quadrilateral::isSquare)
                .sorted(Comparator.comparing(Quadrilateral::calcPerimeter))
                .forEach(System.out::println);
        System.out.println("Custom quadrilaterals:");
        quadrilaterals.stream()
                .filter(q -> !q.isRomb())
                .filter(q -> !q.isSquare())
                .filter(q -> !q.isStraight())
                .sorted(Comparator.comparing(Quadrilateral::calcPerimeter))
                .forEach(System.out::println);
    }
}
