package j05071;

public class ThanhPho {
    private String maVung, ten;
    private int gia;

    public ThanhPho(String maVung, String ten, int gia) {
        this.maVung = maVung;
        this.ten = ten;
        this.gia = gia;
    }

    public int getGia() {
        return gia;
    }

    public String getMaVung() {
        return maVung;
    }

    @Override
    public String toString() {
        return ten;
    }
}
