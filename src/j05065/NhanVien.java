package j05065;

public class NhanVien implements Comparable<NhanVien>{
    private String ma, ten;

    public NhanVien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    private String chucVu() {
        return ma.substring(0, 2);
    }

    private String soHieu() {
        return ma.substring(ma.length()-3);
    }

    private String bacLuong() {
        return ma.substring(2,4);
    }
    @Override
    public String toString() {
        return ten + " " + chucVu() + " " + soHieu() + " " + bacLuong();
    }

    @Override
    public int compareTo(NhanVien o) {
        if(bacLuong().equals(o.bacLuong()))
            return soHieu().compareTo(o.soHieu());
        return o.bacLuong().compareTo(bacLuong());
    }
}
