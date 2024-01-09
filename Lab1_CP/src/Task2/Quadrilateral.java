package Task2;

public class Quadrilateral {
    private Point p1; // top left
    private Point p2; // top right
    private Point p3; // down right
    private Point p4; // down left
    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    public Double calcArea() {
        Double s1 = calcSide(p1, p2);
        Double s2 = calcSide(p2, p3);
        Double s3 = calcSide(p3, p4);
        Double s4 = calcSide(p4, p1);
        Double p = calcPerimeter() / 2;
        return Math.sqrt(
                (p - s1) * (p - s2) * (p - s3) * (p - s4) -
                        s1 * s2 * s3 * s4 * Math.cos((calcCorner(p1, p2, p4) +
                                calcCorner(p3, p2, p4)) / 2)
        );
    }
    public Double calcPerimeter() {
        return calcSide(p1, p2) +
                calcSide(p2, p3) +
                calcSide(p3, p4) +
                calcSide(p4, p1);
    }
    public boolean isSquare() {
        return isStraight() &&
                areEqual(calcSide(p1, p2), calcSide(p2, p3)) &&
                areEqual(calcSide(p2, p3), calcSide(p3, p4)) &&
                areEqual(calcSide(p3, p4), calcSide(p4, p1));
    }
    public boolean isRomb() {
        return areEqual(calcCorner(p1, p2, p4), calcCorner(p3, p2, p4)) &&
                areEqual(calcSide(p1, p2), calcSide(p2, p3)) &&
                areEqual(calcSide(p2, p3), calcSide(p3, p4)) &&
                areEqual(calcSide(p3, p4), calcSide(p4, p1));
    }
    public boolean isStraight() {
        return areEqual(calcCorner(p1, p2, p4), calcCorner(p3, p2, p4)) &&
                areEqual(calcCorner(p1, p2, p4), Math.toRadians(90));
    }
    private Double calcSide(Point p1, Point p2) {
        return Math.sqrt(
                Math.pow(p2.x - p1.x, 2) +
                        Math.pow(p2.y - p1.y, 2)
        );
    }
    private Double calcCorner(Point base, Point p1, Point p2) {
        Point v1 = new Point(p1.x - base.x, p1.y - base.y);
        Point v2 = new Point(p2.x - base.x, p2.y - base.y);
        return Math.acos(
                (v1.x * v2.x + v1.y * v2.y) /
                        Math.sqrt((Math.pow(v1.x, 2) + Math.pow(v1.y, 2)) *
                                (Math.pow(v2.x, 2) + Math.pow(v2.y, 2)))
        );
    }
    private boolean areEqual(Double n1, Double n2) {
        return Math.abs(n1 - n2) < 0.001;
    }
    public static class Point {
        Double x;
        Double y;
        public Point(Double x, Double y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
    @Override
    public String toString() {
        return "Quadrilateral{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                ", p4=" + p4 +
                '}';
    }

}
