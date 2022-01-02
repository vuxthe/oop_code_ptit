package test1.bai1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<MonHoc> ds = new ArrayList<>();
        while (n-->0) {
            ds.add(new MonHoc(in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(ds);
        for (MonHoc mh : ds)
            System.out.println(mh);
    }
}
