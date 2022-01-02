package j07034;

public class Dn implements Comparable<Dn> {
    private String ma, ten;
    private int sl;

    public Dn(String ma, String ten, int sl) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
    }


    @Override
    public String toString() {
        return ma + " " + ten + " " + sl;
    }

    @Override
    public int compareTo(Dn o) {
        return ma.compareTo(o.ma);
    }
}
