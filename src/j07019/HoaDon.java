package j07019;

public class HoaDon {
    private String ma, ten;
    private long tienGiam, tongTien;

    public HoaDon(String ma, String ten, long tienGiam, long tongTien) {
        this.ma = ma;
        this.ten = ten;
        this.tienGiam = tienGiam;
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tienGiam + " " + tongTien;
    }
}
