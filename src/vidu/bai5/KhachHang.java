package vidu.bai5;

import vidu.test.SanPham;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class KhachHang {
    private String ma, ten, diaChi;
    private int sl;
    private Date ngayMua;
    private SanPham p;

    public KhachHang(String ma, String ten, String diaChi, SanPham p, int sl, String ngayMua) throws ParseException {
        this.ma = ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.sl = sl;
        this.ngayMua = new SimpleDateFormat("dd/MM/yyyy").parse(ngayMua);
        this.p = p;
    }

    private int tongTien() {
        return sl * p.getGia();
    }

    private LocalDate exp() {
        LocalDate date = LocalDate.parse(new SimpleDateFormat("dd/MM/yyyy").format(ngayMua));
        date.plusMonths(p.getHsd());
        return date;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + diaChi + " " + p.getMa() + " " + tongTien() + " " + exp();
    }
}
