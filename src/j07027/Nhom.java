package j07027;

public class Nhom implements Comparable<Nhom>{
    private SinhVien sv;
    private BaiTap bt;

    public Nhom(SinhVien sv, BaiTap bt) {
        this.sv = sv;
        this.bt = bt;
    }

    @Override
    public String toString() {
        return sv + " " + bt;
    }

    @Override
    public int compareTo(Nhom o) {
        return sv.getMa().compareTo(o.sv.getMa());
    }
}
