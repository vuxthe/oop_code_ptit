package j05067;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        //Scanner in = new Scanner(new File("DATA.in"));
        ArrayList<DonHang> ds = new ArrayList<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            DonHang dh = new DonHang(in.next(), in.nextInt());
            ds.add(dh);
        }
        Collections.sort(ds);
        for (DonHang dh : ds)
            System.out.println(dh);
    }
}
