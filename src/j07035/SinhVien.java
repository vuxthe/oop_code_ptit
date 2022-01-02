package j07035;

import java.util.StringTokenizer;

public class SinhVien {
    private String ma, ten, lop, email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        StringBuilder kq = new StringBuilder();
        StringTokenizer st = new StringTokenizer(ten);
        while (st.hasMoreTokens()) {
            String tmp = st.nextToken().toLowerCase();
            kq.append(Character.toUpperCase(tmp.charAt(0)));
            kq.append(tmp.substring(1));
            kq.append(" ");
        }
        return kq.toString().trim();
    }

    public String getLop() {
        return lop;
    }
}
