package vidu.bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Khach implements Comparable<Khach>{
    private String maKH, ten, maP;
    private Date first, end;

    public Khach(int maKH, String ten, String maP, String first, String end) throws ParseException {
        this.maKH = "KH" + String.format("%02d", maKH);
        this.ten = ten;
        this.maP = maP;
        this.first = new SimpleDateFormat("dd/MM/yyyy").parse(first);
        this.end = new SimpleDateFormat("dd/MM/yyyy").parse(end);
    }

    private int soNgay() {
        return (int) ((end.getTime() - first.getTime()) / (24*3600*1000));
    }

    @Override
    public String toString() {
        return maKH + " " + ten + " " + maP + " " + soNgay();
    }



    @Override
    public int compareTo(Khach o) {
        return o.soNgay()-soNgay();
    }
}
