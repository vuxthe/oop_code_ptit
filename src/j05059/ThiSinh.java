package j05059;

import java.util.StringTokenizer;

public class ThiSinh implements Comparable<ThiSinh>{
    private String ma, ten;
    private float diem;

    public ThiSinh(String ma, String ten, float diem1, float diem2, float diem3) {
        this.ma = ma;
        this.ten = ten;
        this.diem = diem1*2+diem2+diem3;
    }

    private String convertName() {
        StringBuilder rs = new StringBuilder();
        StringTokenizer st = new StringTokenizer(ten);
        while (st.hasMoreTokens()) {
            String tmp = st.nextToken().toLowerCase();
            rs.append(Character.toUpperCase(tmp.charAt(0)));
            rs.append(tmp.substring(1));
            rs.append(" ");
        }
        return rs.toString().trim();
    }

    private float diemCong() {
        if(ma.charAt(2) == '1')
            return 0.5f;
        if(ma.charAt(2) == '2')
            return 1f;
        return 2.5f;
    }

    public float tongDiem() {
        return diem + diemCong();
    }

    private String convert(float x) {
        if((int) x == x)
            return String.format("%d", (int) x);
        return String.format("%.1f", x);
    }

    @Override
    public String toString() {
        return ma + " " + convertName() + " " + convert(diemCong()) + " " + convert(tongDiem());
    }

    @Override
    public int compareTo(ThiSinh o) {
        if (tongDiem() == o.tongDiem())
            return ma.compareTo(o.ma);
        return o.tongDiem() > tongDiem() ? 1 : -1;
    }
}
