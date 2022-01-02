package j05062;

public class SinhVien implements Comparable<SinhVien>{
    private String name;
    private float gpa;
    private int diemRenLuyen;

    public SinhVien(String name, float gpa, int diemRenLuyen) {
        this.name = name;
        this.gpa = gpa;
        this.diemRenLuyen = diemRenLuyen;
    }

    public String getName() {
        return name;
    }

    public float getGpa() {
        return gpa;
    }

    public int getDiemRenLuyen() {
        return diemRenLuyen;
    }

    public String loaiHocBong(int sl) {
        if (sl < 1) return "KHONG";
        if(gpa >= 3.6 && diemRenLuyen >= 90)
            return "XUATSAC";
        if(gpa >= 3.2 && diemRenLuyen >= 80)
            return "GIOI";
        if(gpa >= 2.5 && diemRenLuyen >= 70)
            return "KHA";
        return "KHONG";
    }

    @Override
    public int compareTo(SinhVien o) {
        return gpa < o.gpa ? -1 : 1;
    }
}
