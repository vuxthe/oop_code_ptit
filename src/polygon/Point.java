package polygon;


public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(x-p.x, 2) + Math.pow(y-p.y, 2));
    }

    public static double distance(Point p, Point q) {
        return Math.sqrt(Math.pow(q.x-p.x, 2) + Math.pow(q.y-p.y, 2));
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}
