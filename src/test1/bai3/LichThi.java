package test1.bai3;

import java.text.SimpleDateFormat;

public class LichThi implements Comparable<LichThi>{
    private CaThi caThi;
    private MonHoc monHoc;
    private String ma;
    private int sl;

    public LichThi(CaThi caThi, MonHoc monHoc, String ma, int sl) {
        this.caThi = caThi;
        this.monHoc = monHoc;
        this.ma = ma;
        this.sl = sl;
    }

    @Override
    public String toString() {
        return caThi + " " + monHoc + " " + ma + " " + sl;
    }

    @Override
    public int compareTo(LichThi o) {
        String ngay1 = new SimpleDateFormat("dd/MM/yyyy").format(caThi.getNgay());
        String ngay2 = new SimpleDateFormat("dd/MM/yyyy").format(o.caThi.getNgay());
        String gio1 = new SimpleDateFormat("HH:mm").format(caThi.getGio());
        String gio2 = new SimpleDateFormat("HH:mm").format(o.caThi.getGio());

        if (ngay1.equals(ngay2)) {
            if (gio1.equals(gio2)) {
                return caThi.getMa().compareTo(o.caThi.getMa());
            }
            return gio1.compareTo(gio2);
        }
        return ngay1.compareTo(ngay2);
//        if (caThi.getNgay().equals(o.caThi.getNgay())) {
//            if (caThi.getGio().equals(o.caThi.getGio()))
//                return caThi.getMa().compareTo(o.caThi.getMa());
//            return caThi.getGio().compareTo(o.caThi.getGio());
//        }
//        return caThi.getNgay().compareTo(o.caThi.getNgay());
    }
}
