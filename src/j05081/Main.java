package j05081;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<MatHang> ds = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= n; i++) {
            ds.add(new MatHang(i, in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine())));
        }
        Collections.sort(ds);
        for (MatHang mh : ds)
            System.out.println(mh);
    }
}
