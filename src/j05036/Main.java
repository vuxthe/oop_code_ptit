package j05036;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
//        Scanner in = new Scanner(new File("DATA.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<MatHang> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            MatHang mh = new MatHang(i, in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()));
            ds.add(mh);
        }
        Collections.sort(ds);
        for (MatHang mh : ds)
            System.out.println(mh);
    }
}
