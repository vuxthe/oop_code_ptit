package Bai2;

import java.util.StringTokenizer;

public class SinhVien implements Comparable<SinhVien>{
    private String msv, ten, lop, email;

    public SinhVien(String msv, String ten, String lop, String email) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    private String chuanHoa(String s) {
        StringBuilder kq = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s.toLowerCase().trim());
        while (st.hasMoreTokens()) {
            String tmp = st.nextToken();
            kq.append(Character.toUpperCase(tmp.charAt(0)));
            kq.append(tmp.substring(1));
            kq.append(" ");
        }
        return kq.toString().trim();
    }

    @Override
    public String toString() {
        return msv + " " + chuanHoa(ten) + " " + lop + " " + email;
    }

    @Override
    public int compareTo(SinhVien o) {
        return msv.compareTo(o.msv);
    }
}
