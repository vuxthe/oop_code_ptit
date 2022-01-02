package j07054;

import java.util.StringTokenizer;

public class BangDiem implements Comparable<BangDiem>{
    private String ma, name;
    private int d1, d2, d3;

    public BangDiem(int ma, String name, int d1, int d2, int d3) {
        this.ma = "SV" + String.format("%02d", ma);
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    private String convertName() {
        StringBuilder rs = new StringBuilder();
        StringTokenizer st = new StringTokenizer(name);
        while (st.hasMoreTokens()) {
            String tmp = st.nextToken().toLowerCase();
            rs.append(Character.toUpperCase(tmp.charAt(0)));
            rs.append(tmp.substring(1));
            rs.append(" ");
        }
        return rs.toString().trim();
    }

    private String diemTB() {
        float tb = (float) (d1*0.25 + d2*0.35 + d3*0.4);
        return String.format("%.2f", tb);
    }

    private String xepLoai() {
        float tb = Float.parseFloat(diemTB());
        if (tb >= 8)
            return "GIOI";
        if (tb >= 6.5)
            return "KHA";
        if (tb >= 5)
            return "TRUNG BINH";
        return "KEM";
    }
    @Override
    public String toString() {
        return ma + " " + convertName() + " " + diemTB() + " " + xepLoai();
    }

    @Override
    public int compareTo(BangDiem o) {
        return Float.parseFloat(o.diemTB()) > Float.parseFloat(diemTB()) ? 1 : -1;
    }
}
