package j07049;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<SanPham> dssp = new ArrayList<>();
    static ArrayList<KhachHang> dskh = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in = new Scanner(new File("MUAHANG.in"));
        int n = Integer.parseInt(in.nextLine());
        while (n-- >0) {
            dssp.add(new SanPham(in.nextLine(), in.nextLine(),Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine())));
        }

        int m = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= m; i++) {
            dskh.add(new KhachHang(i, in.nextLine(), in.nextLine(), sanPham(in.nextLine()), Integer.parseInt(in.nextLine()), in.nextLine()));
        }

        Collections.sort(dskh);
        for (KhachHang kh : dskh)
            System.out.println(kh);
    }

    static SanPham sanPham(String ma) {
        for (SanPham sp : dssp)
            if (sp.getMa().equals(ma))
                return sp;
        return null;
    }
}
