package j05081;

public class MatHang implements Comparable<MatHang>{
    private String ma, ten, donVi;
    private int giaMua, giaBan;

    public MatHang(int ma, String ten, String donVi, int giaMua, int giaBan) {
        this.ma = "MH" + String.format("%03d", ma);
        this.ten = ten;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    private int loi() {
        return giaBan-giaMua;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + donVi + " " + giaMua + " " + giaBan + " " + loi() ;
    }

    @Override
    public int compareTo(MatHang o) {
        if(loi() == o.loi())
            return ma.compareTo(o.ma);
        return o.loi() - loi();
    }
}
