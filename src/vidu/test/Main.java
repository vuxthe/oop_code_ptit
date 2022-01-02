package vidu.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<SanPham> ds = new ArrayList<>();
        while (n-- >0) {
            ds.add(new SanPham(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine())));
        }
        Collections.sort(ds);
        for (SanPham sp : ds)
            System.out.println(sp);
    }
}
