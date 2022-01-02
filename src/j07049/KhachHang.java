package j07049;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KhachHang implements Comparable<KhachHang>{
    private String ma, ten, diaChi;
    private SanPham sp;
    private int sl;
    private Date ngayMua;

    public KhachHang(int ma, String ten, String diaChi, SanPham sp, int sl, String ngayMua) throws ParseException {
        this.ma = "KH" + String.format("%02d", ma);
        this.ten = ten;
        this.diaChi = diaChi;
        this.sp = sp;
        this.sl = sl;
        this.ngayMua = new SimpleDateFormat("dd/MM/yyyy").parse(ngayMua);
    }

    private int tongTien() {
        return sp.getGia()*sl;
    }

    private Date exp() throws ParseException {
        String res = new SimpleDateFormat("dd/MM/yyyy").format(ngayMua);
        int thang = Integer.parseInt(res.substring(3, 5)) + sp.getBh();
        int nam = Integer.parseInt(res.substring(6)) + (thang / 12);
        String tmp = res.substring(0, 2) + "/" + (thang%12) + "/" + nam;
        return new SimpleDateFormat("dd/MM/yyyy").parse(tmp);
    }
    @Override
    public String toString() {
        try {
            return ma + " " + ten + " " + diaChi + " " + sp.getMa() + " " + tongTien() + " " + new SimpleDateFormat("dd/MM/yyyy").format(exp());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public int compareTo(KhachHang o) {
        try {
            if (o.exp().equals(exp()))
                return ma.compareTo(o.ma);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            return exp().compareTo(o.exp());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
}



