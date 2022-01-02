package j07018;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class SinhVien {
    private String ma, ten, lop;
    private Date dob;
    private float gpa;

    public SinhVien(int ma, String ten, String lop, String dob, float gpa) throws ParseException {
        this.ma = "B20DCCN" + String.format("%03d", ma);
        this.ten = ten;
        this.lop = lop;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.gpa = gpa;
    }

    private String chuanHoaTen() {
        StringBuilder kq = new StringBuilder();
        StringTokenizer st = new StringTokenizer(ten);
        while (st.hasMoreTokens()) {
            String res = st.nextToken();
            kq.append(Character.toUpperCase(res.charAt(0)));
            for (int i = 1; i < res.length(); i++) {
                kq.append(Character.toLowerCase(res.charAt(i)));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }

    @Override
    public String toString() {
        return ma + " " + chuanHoaTen() + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(dob) + " " + String.format("%.2f", gpa);
    }
}
