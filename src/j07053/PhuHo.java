package j07053;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhuHo {
    private String id, name;
    private Date dob;
    private float diem1, diem2;

    public PhuHo(int id, String name, String dob, float diem1, float diem2) throws ParseException {
        this.id = "PH" + String.format("%02d", id);
        this.name = name;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.diem1 = diem1;
        this.diem2 = diem2;
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

    private int tuoi() {
        Date now = new Date();
        return now.getYear() - dob.getYear();
    }

    private int diem() {
        float tb = (diem1 + diem2) / 2;
        if(diem1 >= 8 && diem2 >= 8)
            tb += 1;
        else if(diem1 >= 7.5 && diem2 >= 7.5)
            tb += 0.5;
        tb = Math.round(tb);
        if(tb > 10) tb = 10;
        return (int) tb;
    }

    private String xepLoai() {
        if(diem() < 5)
            return "Truot";
        if(diem() == 5 || diem() == 6)
            return "Trung binh";
        if(diem() == 7)
            return "Kha";
        if(diem() == 8)
            return "Gioi";
        return "Xuat sac";
    }

    @Override
    public String toString() {
        return id + " " + convertName() + " " + tuoi() + " " + diem() + " " + xepLoai();
    }
}
