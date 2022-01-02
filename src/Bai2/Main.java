package Bai2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<>();
        while (n-- >0) {
            ds.add(new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(ds);
        for (SinhVien sv : ds)
            System.out.println(sv);
    }
}
