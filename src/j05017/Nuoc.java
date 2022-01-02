package j05017;

public class Nuoc implements Comparable<Nuoc>{
    private String ma, ten;
    private int sl;

    public Nuoc(int ma, String ten, int cu, int moi) {
        this.ma = "KH" + String.format("%02d", ma);
        this.ten = ten;
        this.sl = moi-cu;
    }

    private int tong() {
        float sum = 0;
        int dem = sl;
        if (dem > 100) {
            sum += 200 * (dem-100);
            dem = 100;
        }
        if (dem > 50) {
            sum += 150 * (dem-50);
            dem = 50;
        }
        sum += dem * 100;
        return Math.round(sum * (1+phuPhi()));
    }

    private float phuPhi() {
        if (sl > 100)
            return (float) (5/100.0);
        if (sl > 50)
            return (float) (3/100.0);
        return (float) (2/100.0);
    }


    @Override
    public String toString() {
        return ma + " " + ten + " " + tong();
    }

    @Override
    public int compareTo(Nuoc o) {
        return o.tong()-tong();
    }
}
