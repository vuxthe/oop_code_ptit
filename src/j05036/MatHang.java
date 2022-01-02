package j05036;

public class MatHang implements Comparable<MatHang>{
    private String ma, ten, donVi;
    private double gia, sl;

    public MatHang(int ma, String ten, String donVi, double gia, double sl) {
        this.ma = "MH" + String.format("%02d", ma);
        this.ten = ten;
        this.donVi = donVi;
        this.gia = gia;
        this.sl = sl;
    }

    private double phiVanChuyen() {
        return (Math.round(gia*sl*0.05));
    }

    private double thanhTien() {
        return Math.round(gia*sl + phiVanChuyen());
    }

    private double giaBan() {
        return  Math.ceil(thanhTien() * 1.02 / sl * 0.01) / 0.01;
    }

    private String convert(double a) {
        return String.format("%.0f", a);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + donVi + " " + convert(phiVanChuyen()) + " " + convert(thanhTien()) + " " + convert(giaBan());
    }

    @Override
    public int compareTo(MatHang o) {
        return o.giaBan() > giaBan() ? 1 : -1;
    }
}
