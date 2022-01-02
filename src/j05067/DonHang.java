package j05067;

public class DonHang implements Comparable<DonHang>{
    private String ma;
    private int sl;

    public DonHang(String ma, int sl) {
        this.ma = ma;
        this.sl = sl;
    }

    private String getNhan() {
        String kh = ma.substring(3);
        if(kh.equals("BP"))
            return "British Petro";
        if(kh.equals("ES"))
            return "Esso";
        if(kh.equals("SH"))
            return "Shell";
        if(kh.equals("CA"))
            return "Castrol";
        if(kh.equals("MO"))
            return "Mobil";
        return "Trong Nuoc";
    }

    private int getDonGia() {
        char c = ma.charAt(0);
        if(c == 'X')
            return 128000;
        if(c == 'D')
            return 11200;
        return 9700;
    }

    private int getThue() {
        if (ma.substring(3).equals("TN"))
            return 0;
        char c = ma.charAt(0);
        long tong = (long) sl * getDonGia();
        if(c == 'X')
            return (int) (0.03*tong);
        if(c == 'D')
            return (int) (0.035*tong);
        return (int) (0.02*tong);
    }


    private long getTien() {
        return (long) getDonGia() * sl + getThue();
    }


    @Override
    public String toString() {
        return ma + " " + getNhan() + " " + getDonGia() + " " + getThue() + " " + getTien();
    }

    @Override
    public int compareTo(DonHang o) {
        return o.getTien() > getTien() ? 1 : -1;
    }
}
