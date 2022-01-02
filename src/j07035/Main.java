package j07035;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<SinhVien> dssv = new ArrayList<>();
    static ArrayList<MonHoc> dsmh = new ArrayList<>();
    static ArrayList<BangDiem> dsbd = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in1 = new Scanner(new File("SINHVIEN.in"));
        Scanner in2 = new Scanner(new File("MONHOC.in"));
        Scanner in3 = new Scanner(new File("BANGDIEM.in"));

        int n = Integer.parseInt(in1.nextLine());
        while (n-- >0) {
            dssv.add(new SinhVien(in1.nextLine(), in1.nextLine(), in1.nextLine(), in1.nextLine()));
        }

        int m = Integer.parseInt(in2.nextLine());
        while (m-->0) {
            dsmh.add(new MonHoc(in2.nextLine(), in2.nextLine(), Integer.parseInt(in2.nextLine())));
        }

        int q = Integer.parseInt(in3.nextLine());
        while (q-- >0) {
            dsbd.add(new BangDiem(searchById(in3.next()), searchMon(in3.next()), in3.next()));
        }
        Collections.sort(dsbd);
        int test = in3.nextInt();
        while (test-- >0) {
            String maLop = in3.next();
            System.out.println("BANG DIEM lop " + maLop + ":");
            for (BangDiem bd : dsbd) {
                if (bd.getMaLop().equals(maLop))
                    System.out.println(bd);
            }
        }
    }

    static SinhVien searchById(String ma) {
        for (SinhVien sv : dssv)
            if(sv.getMa().equals(ma))
                return sv;
        return null;
    }


    static MonHoc searchMon(String ma) {
        for (MonHoc mh : dsmh)
            if(mh.getMa().equals(ma))
                return mh;
        return null;
    }
}
