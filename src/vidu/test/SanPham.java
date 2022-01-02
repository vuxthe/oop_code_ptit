package vidu.test;

public class SanPham implements Comparable<SanPham>{
    private String ma, ten;
    private int gia, hsd;

    public SanPham(String ma, String ten, int gia, int hsd) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.hsd = hsd;
    }

    public String getMa() {
        return ma;
    }

    public int getGia() {
        return gia;
    }

    public int getHsd() {
        return hsd;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gia + " " + hsd;
    }

    @Override
    public int compareTo(SanPham o) {
        if (gia == o.gia)
            return ma.compareTo(o.ma);
        return o.gia-gia;
    }
}
