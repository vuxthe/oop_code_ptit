package polygon;

import java.util.ArrayList;

public class Polygon {
    private Point[] p;

    public Polygon(Point[] p) {
        this.p = p;
    }

    public String getArea() {
        ArrayList<Point> ds = new ArrayList<>();
        for (int i = 0; i < p.length; i++) {
            ds.add(p[i]);
        }
        ds.add(p[0]);
        double kq = 0;
        for (int i = 0; i < ds.size() - 1; i++) {
                kq += ds.get(i).getX() * ds.get(i+1).getY();
                kq -= ds.get(i).getY() * ds.get(i+1).getX();
        }
        kq/=2;
        return String.format("%.3f", kq);
    }
}
