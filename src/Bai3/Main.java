package Bai3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<SinhVien> dssv = new ArrayList<>();
    static ArrayList<DoanhNghiep> dsdn = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in1 = new Scanner(new File("SINHVIEN.in"));
        Scanner in2 = new Scanner(new File("DN.in"));
        Scanner in3 = new Scanner(new File("THUCTAP.in"));

        int n = Integer.parseInt(in1.nextLine());

        while (n-- >0) {
            dssv.add(new SinhVien(in1.nextLine(), in1.nextLine(), in1.nextLine(), in1.nextLine()));
        }

        int m = Integer.parseInt(in2.nextLine());
        while (m-- >0) {
            dsdn.add(new DoanhNghiep(in2.nextLine(), in2.nextLine(), Integer.parseInt(in2.nextLine())));
        }
        ArrayList<ThucTap> ds = new ArrayList<>();
        int q = Integer.parseInt(in3.nextLine());
        while (q-- >0) {
                String msv = in3.next();
                String maDn = in3.next();
                ds.add(new ThucTap(searchSv(msv), searchDn(maDn)));
        }
        Collections.sort(ds);
        int ss = in3.nextInt();
        while (ss-- >0) {
            String maDn = in3.next();
            int soSv = soL(maDn);
            System.out.println("DANH SACH THUC TAP TAI " + tenDN(maDn) + ":");
            for (ThucTap tt : ds) {
                if(tt.getMaDN().equals(maDn) && soSv >0) {
                    soSv--;
                    System.out.println(tt.getSv().toString());
                }
            }
        }

    }
    static String tenDN(String ma) {
        for (DoanhNghiep dn : dsdn) {
            if(dn.getMa().equals(ma))
                return dn.getTen();
        }
        return "";
    }
    static int soL(String ma) {
        for (DoanhNghiep dn : dsdn) {
            if(dn.getMa().equals(ma))
                return dn.getSl();
        }
        return 0;
    }
    static SinhVien searchSv(String ma) {
        for (SinhVien sv : dssv) {
            if(sv.getMsv().equals(ma))
                return sv;
        }
        return null;
    }

    static DoanhNghiep searchDn(String ma) {
        for (DoanhNghiep dn : dsdn) {
            if(dn.getMa().equals(ma))
                return dn;
        }
        return null;
    }
}
