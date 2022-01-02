package test1.bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CaThi implements Comparable<CaThi>{
    private String ma, phong;
    private Date ngay, gio;

    public CaThi(int ma, String ngay, String gio, String phong) throws ParseException {
        this.ma = "C" + String.format("%03d", ma);
        this.phong = phong;
        this.ngay = new SimpleDateFormat("dd/MM/yyyy").parse(ngay);
        this.gio = new SimpleDateFormat("HH:mm").parse(gio);
    }

    @Override
    public String toString() {
        return ma + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngay)
                + " " + new SimpleDateFormat("HH:mm").format(gio) + " " + phong;
    }

    @Override
    public int compareTo(CaThi o) {
//        String ngay1 = new SimpleDateFormat("dd/MM/yyyy").format(ngay);
//        String ngay2 = new SimpleDateFormat("dd/MM/yyyy").format(o.ngay);
//        String gio1 = new SimpleDateFormat("HH:mm").format(gio);
//        String gio2 = new SimpleDateFormat("HH:mm").format(o.gio);
        if (ngay.equals(o.ngay)) {
            if (gio.equals(o.gio))
                return ma.compareTo(o.ma);
            return gio.compareTo(o.gio);
        }
        return ngay.compareTo(o.ngay);
    }
}
