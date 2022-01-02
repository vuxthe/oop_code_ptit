package vidu.bai4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Khach implements Comparable<Khach>{
    private String maKH, ten, maP;
    private Date first, end;
    private LoaiPhong p;

    public Khach(int maKH, String ten, String maP, String first, String end, LoaiPhong p) throws ParseException {
        this.maKH = "KH" + String.format("%02d", maKH);
        this.ten = ten;
        this.maP = maP;
        this.first = new SimpleDateFormat("dd/MM/yyyy").parse(first);
        this.end = new SimpleDateFormat("dd/MM/yyyy").parse(end);
        this.p = p;
    }

    private int soNgay() {
        return (int) ((end.getTime() - first.getTime()) / (24*3600*1000));
    }

    private float giamGia() {
        if(soNgay() < 10)
            return 0f;
        if(soNgay() < 20)
            return 0.02f;
        if(soNgay() < 30)
            return 0.04f;
        return 0.06f;
    }
    private double tongTien() {
        int soNgayThue = soNgay();
        if(soNgayThue < 1)
            soNgayThue = 1;
        float phiDv = p.getDv();
        int gia = p.getGia();
        double tong = (gia * soNgayThue * (1 + phiDv)) * (1 - giamGia());
        return (double) Math.round(tong*100) / 100;
    }

    @Override
    public String toString() {
        return maKH + " " + ten + " " + maP + " " + soNgay() + " " + String.format("%.2f", tongTien());
    }

    @Override
    public int compareTo(Khach o) {
        return o.soNgay()-soNgay();
    }
}
