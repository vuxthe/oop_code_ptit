package j07035;

public class BangDiem implements Comparable<BangDiem>{
    private SinhVien sv;
    private MonHoc mon;
    private String diem;

    public BangDiem(SinhVien sv, MonHoc mon, String diem) {
        this.sv = sv;
        this.mon = mon;
        this.diem = diem;
    }

    public String getMaLop() {
        return sv.getLop();
    }

    public String getMaMon() {
        return mon.getMa();
    }

    public float getDiem() {
        return Float.parseFloat(diem);
    }

    @Override
    public String toString() {
        return sv.getMa() + " " + sv.getTen() + " " + mon.getMa() + " " + mon.getTen() + " " + diem;
    }

    @Override
    public int compareTo(BangDiem o) {
        if (mon.getMa().equals(o.mon.getMa()))
            return sv.getMa().compareTo(o.sv.getMa());
        return mon.getMa().compareTo(o.mon.getMa());
    }
}
