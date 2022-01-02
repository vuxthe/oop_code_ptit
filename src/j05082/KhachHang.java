package j05082;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class KhachHang implements Comparable<KhachHang>{
    private String id, name, gender, add;
    private Date dob;

    public KhachHang(int id, String name, String gender, String dob, String add) throws ParseException {
        this.id = "KH" + String.format("%03d", id);
        this.name = convert(name);
        this.gender = gender;
        this.add = add;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
    }

    private String convert(String name) {
        StringBuilder kq = new StringBuilder();
        StringTokenizer st = new StringTokenizer(name.trim().toLowerCase());
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
        return id + " " + name + " " +gender + " " + add + " " + new SimpleDateFormat("dd/MM/yyyy").format(dob);
    }

    @Override
    public int compareTo(KhachHang o) {
        return dob.compareTo(o.dob);
    }
}
