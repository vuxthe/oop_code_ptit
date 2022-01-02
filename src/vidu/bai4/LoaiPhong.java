package vidu.bai4;

public class LoaiPhong{
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

    public String getMa() {
        return ma;
    }

    public float getDv() {
        return dv;
    }

    public int getGia() {
        return gia;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gia + " " + dv;
    }

}
