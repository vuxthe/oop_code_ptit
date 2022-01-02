package j07019;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DATA1.in"));
        ArrayList<MatHang> ds1 = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {
            MatHang mh = new MatHang(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()));
            ds1.add(mh);
        }
        Scanner in2 = new Scanner(new File("DATA2.in"));
        int m = Integer.parseInt(in2.nextLine());
        for (int i = 1; i <= m; i++) {
            String maMH = in2.next();
            int sl = Integer.parseInt(in2.nextLine().trim());
            String ma = "", ten = "";
            long giaGiam = 0, tongTien = 0;
            for (MatHang mh : ds1) {
                if(maMH.substring(0, 2).equals(mh.getMa())) {
                    ten = mh.getTen();
                    int gia;
                    if(maMH.charAt(2) == '1') gia = mh.getGia1();
                    else gia = mh.getGia2();
                    tongTien = gia * sl;
                    if(sl >= 150) {
                        giaGiam = tongTien/2;
                    }else if(sl >= 100) {
                        giaGiam = (long) (tongTien * 0.3);
                    }else if(sl >= 50) giaGiam = (long) (tongTien * 0.15);
                    break;
                }
            }
            HoaDon hd = new HoaDon(maMH + "-" + String.format("%03d", i), ten, giaGiam, tongTien - giaGiam);
            System.out.println(hd);
        }
    }
}
