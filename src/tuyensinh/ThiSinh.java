package tuyensinh;

public class ThiSinh  {
    private String id, ten;
    private float toan, ly, hoa;

    public ThiSinh(String id, String ten, float toan, float ly, float hoa) {
        this.id = id;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    private float diemThi() {
        return toan * 2 + ly + hoa;
    }
    private float tong() {
        return diemThi() + Float.parseFloat(diemCong());
    }

    private String ketQua() {
        if (tong() >= 24)
            return "TRUNG TUYEN";
        return "TRUOT";
    }

    private String diemCong() {
        Character res = id.charAt(2);
        if (res == '1')
            return "0.5";
        if (res == '2')
            return "1";
        return "2.5";
    }

    @Override
    public String toString() {
        if (diemThi() == (int) diemThi())
            return id + " " + ten + " " + diemCong() + " " + (int) diemThi() + " " + ketQua();
        else
            return id + " " + ten + " " + diemCong() + " " + String.format("%.1f", diemThi()) + " " + ketQua();
    }
}