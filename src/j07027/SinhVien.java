package j07027;

public class SinhVien {
    private String ma, ten, sdt;

    public SinhVien(String ma, String ten, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + sdt;
    }
}
