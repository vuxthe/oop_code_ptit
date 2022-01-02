package Bai3;

public class DoanhNghiep {
    private String ma, ten;
    private int sl;

    public DoanhNghiep(String ma, String ten, int sl) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getSl() {
        return sl;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + sl;
    }

}
