package j05010;

public class MatHang implements Comparable<MatHang>{
    private String ten, loai;
    private int stt;
    private double giaMua, giaBan;

    public MatHang(String ten, String loai, int stt, double giaMua, double giaBan) {
        this.ten = ten;
        this.loai = loai;
        this.stt = stt;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return stt + " " + ten + " " + loai + " " + String.format("%.2f", giaBan - giaMua);
    }

    @Override
    public int compareTo(MatHang o) {
        return (o.giaBan - o.giaMua) > (giaBan - giaMua) ? 1 : -1;
    }
}
