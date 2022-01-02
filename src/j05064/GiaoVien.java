package j05064;

public class GiaoVien {
    private String ma, ten;
    private int luong;

    public GiaoVien(String ma, String ten, int luong) {
        this.ma = ma;
        this.ten = ten;
        this.luong = luong;
    }

    public String getChucVu() {
        return ma.substring(0,2);
    }
    private int getHeSo() {
        return Integer.parseInt(ma.substring(2));
    }

    private int getPhuCap() {
        if(ma.substring(0, 2).equals("HT"))
            return 2000000;
        if(ma.substring(0, 2).equals("HP"))
            return 900000;
        return 500000;
    }

    private int getTongLuong() {
        return luong*getHeSo() + getPhuCap();
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + getHeSo() + " " + getPhuCap() + " " + getTongLuong();
    }
}
