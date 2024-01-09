package Task2;

public class Point {
    Double x;
    Double y;
    Double xPerSecond = 0d;
    Double yPerSecond = 0d;
    public void setStartPosition(Double x, Double y) {
        this.x = x;
        this.y = y;
    }
    public void setMovement(Double xPerSecond, Double yPerSecond) {
        this.xPerSecond = xPerSecond;
        this.yPerSecond = yPerSecond;
    }
    public boolean isCollisionPossible(Point point) {
        return Math.abs(this.x * this.xPerSecond - point.x * point.xPerSecond) <
                0.001 &&
                Math.abs(this.y * this.yPerSecond - point.y * point.yPerSecond) <
                        0.001;
    }
    public Double calculateDistance(Point point, Integer seconds) {
        return Math.sqrt( Math.pow(point.getXForTime(seconds) -
                this.getXForTime(seconds), 2) +
                Math.pow(point.getYForTime(seconds) -
                        this.getYForTime(seconds), 2));
    }
    public Double getXForTime(Integer seconds) {
        return x + xPerSecond * seconds;
    }
    public Double getYForTime(Integer seconds) {
        return y + yPerSecond * seconds;
    }
}
