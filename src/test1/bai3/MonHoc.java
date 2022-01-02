package test1.bai3;

public class MonHoc {
    private String ma, ten, hinhThuc;

    public MonHoc(String ma, String ten, String hinhThuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhThuc = hinhThuc;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ten;
    }

}
