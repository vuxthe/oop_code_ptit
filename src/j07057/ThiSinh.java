package j07057;

import java.util.StringTokenizer;

public class ThiSinh implements Comparable<ThiSinh>{
    private String ma, ten;
    private float diem;
    private String danToc, kv;

    public ThiSinh(int ma, String ten, float diem, String danToc, String kv) {
        this.ma = "TS" + String.format("%02d", ma);
        this.ten = ten;
        this.diem = diem;
        this.danToc = danToc;
        this.kv = kv;
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

    private float tongDiem() {
        if (kv.equals("1")) {
            if (danToc.equals("Kinh"))
                return (float) (diem + 1.5);
            return (diem + 3);
        }
        if (kv.equals("2")) {
            if (danToc.equals("Kinh"))
                return (float) (diem + 1);
            return (float) (diem + 2.5);
        }
        if (kv.equals("3")) {
            if (danToc.equals("Kinh"))
                return diem;
            return (float) (diem + 1.5);
        }
        return 0;
    }

    private String kq() {
        if (tongDiem() >= 20.5)
            return "Do";
        return "Truot";
    }

    @Override
    public String toString() {
        return ma + " " + convertName() + " " + String.format("%.1f",tongDiem()) + " " + kq();
    }

    @Override
    public int compareTo(ThiSinh o) {
        if (o.tongDiem() == tongDiem())
            return ma.compareTo(o.ma);
        return o.tongDiem() > tongDiem() ? 1 : -1;
    }
}
