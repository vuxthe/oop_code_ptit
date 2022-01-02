package vidu.bai3;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner in = new Scanner(new File("KHACH.in"));
        ArrayList<Khach> ds = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= n; i++) {
            ds.add(new Khach(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }

        Collections.sort(ds);
        for (Khach k : ds)
            System.out.println(k);
    }
}
