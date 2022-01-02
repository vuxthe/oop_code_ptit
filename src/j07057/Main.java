package j07057;

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
        for (int i = 1; i <= n; i++) {
            ds.add(new ThiSinh(i, in.nextLine(), Float.parseFloat(in.nextLine()), in.nextLine(), in.nextLine()));
        }
        Collections.sort(ds);
        for (ThiSinh ts : ds)
            System.out.println(ts);
    }
}
