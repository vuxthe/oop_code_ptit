package j07051;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class KhachHang implements Comparable<KhachHang>{
    private String ma, ten, soPhong;
    private Date ngayNhan, ngayTra;
    private int dv;

    public KhachHang(int ma, String ten, String soPhong, String ngayNhan, String ngayTra, int dv) throws ParseException {
        this.ma = "KH" + String.format("%02d", ma);
        this.ten = ten;
        this.soPhong = soPhong;
        this.ngayNhan = new SimpleDateFormat("dd/MM/yyyy").parse(ngayNhan);
        this.ngayTra = new SimpleDateFormat("dd/MM/yyyy").parse(ngayTra);;
        this.dv = dv;
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

    private int soNgay() {
        return (int) ((ngayTra.getTime() - ngayNhan.getTime()) / (24*3600*1000)) + 1;
    }

    private int tongTien() {
        if(soPhong.charAt(0) == '1')
            return 25 * soNgay() + dv;
        if(soPhong.charAt(0) == '2')
            return 34 * soNgay() + dv;
        if(soPhong.charAt(0) == '3')
            return 50 * soNgay() + dv;
        return 80 * soNgay() + dv;
    }
    @Override
    public String toString() {
        return ma + " " + convertName() + " " + soPhong + " " + soNgay() + " " + tongTien();
    }

    @Override
    public int compareTo(KhachHang o) {
        return o.tongTien() - tongTien();
    }
}
