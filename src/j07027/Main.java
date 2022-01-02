package j07027;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<SinhVien> dssv = new ArrayList<>();
    static ArrayList<BaiTap> dsbt = new ArrayList<>();
    static ArrayList<Nhom> dsn = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in1 = new Scanner(new File("SINHVIEN.in"));
        Scanner in2 = new Scanner(new File("BAITAP.in"));
        Scanner in3 = new Scanner(new File("NHOM.in"));

        int n = Integer.parseInt(in1.nextLine());
        while (n-- >0) {
            dssv.add(new SinhVien(in1.nextLine(), in1.nextLine(), in1.nextLine()));
        }

        int m = Integer.parseInt(in2.nextLine());
        for (int i = 1; i <= m; i++) {
            dsbt.add(new BaiTap(i, in2.nextLine()));
        }

        while (in3.hasNextLine()) {
            String[] data = in3.nextLine().split("\\s+");
            dsn.add(new Nhom(searchByMa(data[0]), searchByStt(Integer.parseInt(data[1]))));
        }
        Collections.sort(dsn);
        for (Nhom nhom : dsn)
            System.out.println(nhom);
    }

    static SinhVien searchByMa(String ma) {
        for (SinhVien sv : dssv) {
            if(sv.getMa().equals(ma))
                return sv;
        }
        return null;
    }

    static BaiTap searchByStt(int stt) {
        for (BaiTap bt : dsbt) {
            if(bt.getStt() == stt)
                return bt;
        }
        return null;
    }
}
