package j07050;

public class MatHang implements Comparable<MatHang> {
    private String ma, ten, loai;
    private float giaMua, giaBan;

    public MatHang(int ma, String ten, String loai, float giaMua, float giaBan) {
        this.ma = "MH" + String.format("%02d", ma);
        this.ten = ten;
        this.loai = loai;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    private float loiNhuan() {
        return giaBan - giaMua;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + loai + " " + String.format("%.2f", loiNhuan());
    }

    @Override
    public int compareTo(MatHang o) {
        return o.loiNhuan() > loiNhuan() ? 1 : -1;
    }
}
