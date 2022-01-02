package j05059;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<ThiSinh> ds = new ArrayList<>();
        while (n-- >0) {
            ThiSinh ts = new ThiSinh(in.nextLine(), in.nextLine(), Float.parseFloat(in.nextLine()), Float.parseFloat(in.nextLine()), Float.parseFloat(in.nextLine()));
            ds.add(ts);
        }
        Collections.sort(ds);
        int sl = in.nextInt();
        float diemChuan = ds.get(sl-1).tongDiem();
        System.out.println(String.format("%.1f", diemChuan));
        for (ThiSinh ts : ds) {
            System.out.print(ts);
            if (ts.tongDiem() < diemChuan) {
                System.out.println(" TRUOT");
            }else System.out.println(" TRUNG TUYEN");
        }
    }
}
