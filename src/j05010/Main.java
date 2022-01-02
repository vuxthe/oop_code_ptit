package j05010;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<MatHang> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            MatHang mh = new MatHang(in.nextLine(), in.nextLine(), i, Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()));
            ds.add(mh);
        }

        Collections.sort(ds);
        for (MatHang mh : ds)
            System.out.println(mh);
    }

}
