package Bai3;

public class ThucTap implements Comparable<ThucTap>{
    private SinhVien sv;
    private DoanhNghiep dn;

    public ThucTap(SinhVien sv, DoanhNghiep dn) {
        this.sv = sv;
        this.dn = dn;
    }

    public SinhVien getSv() {
        return sv;
    }

    public DoanhNghiep getDn() {
        return dn;
    }

    public String getMaDN() {
        return dn.getMa();
    }

    @Override
    public int compareTo(ThucTap o) {
        return sv.getMsv().compareTo(o.sv.getMsv());
    }
}
