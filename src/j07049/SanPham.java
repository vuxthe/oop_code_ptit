package j07049;

public class SanPham {
    private String ma, ten;
    private int gia, bh;

    public SanPham(String ma, String ten, int gia, int bh) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.bh = bh;
    }

    public String getMa() {
        return ma;
    }

    public int getGia() {
        return gia;
    }

    public int getBh() {
        return bh;
    }
}
