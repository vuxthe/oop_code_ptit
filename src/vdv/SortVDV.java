package vdv;

public class SortVDV implements Comparable<SortVDV>{
    private String ma, ten, tgThuc, uuTien, ketQua;
    private int rank;

    public SortVDV(String ma, String ten, String tgThuc, String uuTien, String ketQua, int rank) {
        this.ma = ma;
        this.ten = ten;
        this.tgThuc = tgThuc;
        this.uuTien = uuTien;
        this.ketQua = ketQua;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tgThuc + " " + uuTien + " " + ketQua + " " + rank;
    }

    @Override
    public int compareTo(SortVDV o) {
        return rank-o.rank;
    }
}
