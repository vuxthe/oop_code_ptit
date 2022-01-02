package j07051;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in = new Scanner(new File("KHACHHANG.in"));
        ArrayList<KhachHang> ds = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= n; i++) {
            ds.add(new KhachHang(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine())));
        }
        Collections.sort(ds);
        for (KhachHang kh : ds)
            System.out.println(kh);
    }
}
