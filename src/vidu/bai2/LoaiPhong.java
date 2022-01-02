package vidu.bai2;

public class LoaiPhong implements Comparable<LoaiPhong>{
    private String ma, ten;
    private int gia;
    private float dv;

    public LoaiPhong(String line) {
        String[] arr = line.split("\\s+");
        this.ma = arr[0];
        this.ten = arr[1];
        this.gia = Integer.parseInt(arr[2]);
        this.dv = Float.parseFloat(arr[3]);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gia + " " + dv;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return ten.compareTo(o.ten);
    }
}
